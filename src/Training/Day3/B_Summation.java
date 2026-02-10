package Training.Day3;
import java.util.*;

public class B_Summation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }
}
