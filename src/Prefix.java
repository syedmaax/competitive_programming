import java.util.*;
public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int [] prefix = new int[n+1];
            for (int i = 1; i < n; i++) {
                prefix[i] = arr[i]+prefix[i-1];
            }
            int mini=0;

            int j=1;
            int count=0;
            while(j<prefix.length){
                int i=mini;
                while(i<j){
                    if(prefix[j]-prefix[i]==0){
                        count++;
                        mini=j+1;
                        j=mini;
                        break;
                    }else{
                        i++;
                    }
                }
                j++;
            }
            System.out.println(count);

        }
    }
}