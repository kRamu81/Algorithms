package Training.Day3;
import java.util.*;
public class C_Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        boolean found = false;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                found = true;
                break;
            }

        }
        System.out.println(found?"yes":"No");
    }
}
