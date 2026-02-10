package N250.Day1;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(Arrays.equals(
                a.chars().sorted().toArray(),
                b.chars().sorted().toArray()
        ));

    }
}
