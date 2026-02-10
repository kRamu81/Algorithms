package Training.Day2;
import java.util.*;
public class D_ChefandStocks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int sum =0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                sum += a[i];
                min = Math.min(min,a[i]);
            }
            System.out.println(sum - min);
        }
    }
}
