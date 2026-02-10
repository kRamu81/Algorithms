package Training.Day3;
import java.util.*;

public class F_palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        boolean ispalin = true;
        for(int i = 0; i < n/2; i++){
            if(a[i] != a[n - i - 1]){
                ispalin = false;
                break;
            }
        }

        System.out.println(ispalin ? "Yes" : "No");
    }
}
