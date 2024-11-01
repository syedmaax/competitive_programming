import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] [] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int maxi=Integer.MIN_VALUE;
            int maxj = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, arr[i][0]);
                maxj = Math.max(maxj, arr[i][1]);
            }
            System.out.println(2*(maxi+maxj));
        }
    }
}