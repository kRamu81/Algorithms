package Training.Day2;
import java.util.*;

public class A_WaterConsumption {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            System.out.println(n>=2000?"YES":"NO");
        }
    }
}
