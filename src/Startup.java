import java.util.*;
public class Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
           int k = sc.nextInt();
           int [] b = new int[k];
           int [] c = new int[k];
           for(int i = 0; i < k; i++) {
               b[i] = sc.nextInt();
               c[i] = sc.nextInt();
           }
           int i=0;
           int j=0;
           HashMap<Integer,Long> map = new HashMap<>();
           long max = Long.MIN_VALUE;
           while(j<b.length) {
               map.put(b[j],map.getOrDefault(b[j], 0L)+c[j]);
               while(map.size()>n){
                   map.put(b[i],map.get(b[i])-c[i]);
                   if(map.get(b[i])==0){
                       map.remove(b[i]);
                   }
                   i++;
               }
               long x =0;
               for(int a : map.keySet()){
                   x+=map.get(a);
               }
               max=Math.max(max,x);
               j++;

           }
            System.out.println(max);

        }
    }
}