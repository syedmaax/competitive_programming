import java.util.*;

public class Anya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s =sc.next();
            int q =sc.nextInt();
            int[] arr =new int[q];
            char[] v =new char[q];

            for(int i =0;i<q;i++) {
                arr[i] =sc.nextInt() - 1;
                v[i] =sc.next().charAt(0);
            }
            StringBuilder sb =new StringBuilder(s);
            HashSet<Integer> map =new HashSet<>();
            for(int i = 0; i <= sb.length() - 4; i++) {
                if (sb.substring(i, i + 4).equals("1100")) {
                    map.add(i);
                }
            }
            for(int i = 0; i < q; i++) {
                if(sb.charAt(arr[i]) != v[i]) {
                    for(int j =Math.max(0, arr[i] - 3); j <=arr[i]; j++) {
                        if(j <=sb.length()-4&&sb.substring(j,j+4).equals("1100")) {
                            map.remove(j);
                        }
                    }
                    sb.setCharAt(arr[i],v[i]);
                    for(int j = Math.max(0, arr[i] - 3); j <= arr[i]; j++) {
                        if(j <= sb.length() - 4 && sb.substring(j, j + 4).equals("1100")) {
                            map.add(j);
                        }
                    }
                }
                if(map.isEmpty()) {
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }

        sc.close();
    }
}
