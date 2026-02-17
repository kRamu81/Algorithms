package Training.Arrays;

import java.util.*;
public class FreqElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            freq[x]++;
        }
        for(int i=1;i<=n;i++){
            System.out.println(i+":"+freq[i]);
        }
    }
}
