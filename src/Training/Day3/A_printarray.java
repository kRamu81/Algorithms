package Training.Day3;
import java.util.*;
public class A_printarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = s.nextInt();
            System.out.print(a[i]+" ");
        }
    }
}
