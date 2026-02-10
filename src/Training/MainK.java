package Training;
import java.util.*;

class Maink {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int x=s.nextInt();
            int y = s.nextInt();
            System.out.println(x-(y/2));
        }
    }
}
