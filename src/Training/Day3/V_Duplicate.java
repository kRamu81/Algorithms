package Training.Day3;
import java.util.*;
public class V_Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(s.nextInt());
            }
            ArrayList<Integer> l = new ArrayList<>(set);
            Collections.sort(l);
            for(int x : l){
                System.out.print(x+" ");
            }

        }
    }
}
