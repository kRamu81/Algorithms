package TimeComplexity;
import java.util.*;
public class C_MAkeAllEqualUsingPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for(int val : a){
                map.put(val,map.getOrDefault(val,0)+1);
            }
            int maxfreq = 0;
            for(int value : map.values()){
                maxfreq = Math.max(maxfreq,value);
            }
            System.out.println(n-maxfreq);
        }
    }
}
