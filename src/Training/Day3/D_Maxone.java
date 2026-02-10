package Training.Day3;

import java.util.*;
public class D_Maxone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        int ans =0;
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            if(a[i]> max){
                max = a[i];
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
