import java.util.*;
public class Quintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            for(int i=0;i<n-1;i++){
                int x = Math.abs(arr[i]-arr[i+1]);
                if(x!=5&&x!=7){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}