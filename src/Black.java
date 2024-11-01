import java.util.*;
public class Black {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(n==1){
                System.out.println(1);
                continue;
            }
            int max=Integer.MIN_VALUE;
            int index=0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n-1; i++) {
                int i1 = arr[i + 1] - arr[i];
                if (i1 > max) {
                    max = i1;
                    index = i;
                }
            }
            int avg = (arr[index]+arr[index+1])/2;
            for(int i=0;i<n;i++){
                list.add(arr[i]);
                if(i==index&&arr[i]!=avg){
                    list.add(avg);
                }
            }
            max=Integer.MIN_VALUE;
            int i=0;
            while(i<n-1){
                max=Math.max(max,list.get(i+1)-list.get(i));
                i+=2;
            }
            System.out.println(max);
        }
    }
}