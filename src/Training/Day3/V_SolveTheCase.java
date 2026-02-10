package Training.Day3;
import java.util.*;
public class V_SolveTheCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            System.out.println(a[0]);
            for(int i=1;i<n;i++){
                if(a[i] != a[i-1]){
                    System.out.print(" "+a[i]);
                }
            }
        }
    }
}
