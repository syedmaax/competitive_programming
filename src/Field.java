import java.util.*;
public class Field {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    if(arr[i]!=arr[n-i-1]){
                        if(n-i<n&&n-i>i){
                            if(arr[n-i]!=arr[i]&&arr[n-i-2]!=arr[n-i]){

                            }
                        }
                    }
                }
            }

        }
    }
}