package Training.Day2;
import java.util.*;

public class B_NonNegativeProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
           int n = s.nextInt();
           int[] a = new int[n];
           for(int i=0;i<n;i++){
               a[i] = s.nextInt();
           }
           int c0 = 0;
           int cn = 0;
           for(int i=0;i<n;i++){
               if(a[i]==0) c0++;
               else if(a[i]<0) cn++;
           }

           if(c0 > 0 || cn%2 == 0) System.out.println("0");
           else System.out.println("1");

        }
    }
}
