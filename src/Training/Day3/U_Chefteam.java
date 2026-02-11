package Training.Day3;
import java.util.*;

public class U_Chefteam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t  = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int e = 0;
            int o =0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    if(i%2==0) e++;
                    else o++;
                }
            }
            if(o==e) System.out.println(1);
            else System.out.println(0);
        }
    }
}
