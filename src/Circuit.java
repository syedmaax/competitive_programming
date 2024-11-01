import java.util.*;
public class Circuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i] = sc.nextInt();
            }
            int min=0;
            int max=0;
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i+=2){
                min+=arr[i]^arr[i+1];
            }
            int i=0;
            int j = arr.length-1;
            while(i<j){

                    max+=arr[i]^arr[j];

                i++;
                j--;
            }
            System.out.println(min+" "+max);
        }
    }
}