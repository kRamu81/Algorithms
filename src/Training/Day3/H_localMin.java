package Training.Day3;
import java.util.*;
public class H_localMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = s.nextInt();

        }
        int ans = 0;
        for(int i=1;i<n;i++){
            if(a[i-1]<a[i] && a[i+1]>a[i]){
                ans = i;
            }
        }
        System.out.println(ans);

    }


}
