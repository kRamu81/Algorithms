package TimeComplexity;
import java.util.*;
public class A_LuckyFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int count =0;
            while(n>0){
                if(n%10==4) count++;
                n = n/10;
            }
            System.out.println(count);
        }

    }
}
