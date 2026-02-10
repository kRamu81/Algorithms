package Training.Day2;
import java.util.*;
public class H_Rightangledtrianglepattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
