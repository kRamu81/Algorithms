package Training.Arrays;
import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        boolean[] seen = new boolean[10001];
        int d = 0;
        for(int i=0;i<n;i++){
            if(!seen[a[i]]){
                seen[a[i]] = true;
                d++;
            }
        }
        System.out.println(d);
    }
}
