package Training.Day3;
import java.util.*;
public class W_multiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            long mul =1;
            for(int i=0;i<n;i++){
                int a = s.nextInt();
                mul *= a;
            }
            System.out.println(mul);
        }
    }
}
