package Training.Day2;
import java.util.*;
public class C_ICanUseBothHands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            System.out.println((c+a-1)/a + (c/b));
        }
    }
}
