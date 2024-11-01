import java.util.*;
public class Medians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n==1&&k==1){
                System.out.println(1);
                System.out.println(1);
                continue;
            }
            int check = 2*k-1;
            if(check==1){
                System.out.println(-1);
                continue;
            }
            if(check<=n){
                System.out.println(check);
                for(int i=1;i<=check;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }else{
                int scheck=(n-k)*2;
                scheck++;
                if(scheck==1){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(scheck);
                System.out.print(1+" ");
                scheck=n-scheck;
                scheck+=2;
                for(int i=scheck;i<=n;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }


        }
    }
}