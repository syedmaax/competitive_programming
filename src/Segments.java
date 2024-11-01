import java.util.*;
public class Segments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int max=Math.min(x,y);
            int [] arr = new int[4];
            int [] arr2 = new int[4];
            arr[1]=max;
            arr[2]=max;
            arr2[2]=max;
            arr2[3]=max;
            for(int i=0;i<4;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for(int i=0;i<4;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println();


        }
    }
}