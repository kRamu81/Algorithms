package Training.Day3;
import java.util.*;
public class E_minArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
