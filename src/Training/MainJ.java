package Training;
import java.util.*;

public class MainJ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0) System.out.println("Yes");
        else if(n%4==0) System.out.println("Yes");
        else if(n%8==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
