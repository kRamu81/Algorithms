package TimeComplexity;
import java.util.*;
public class B_PlayingWithMatches {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr= {6,2,5,5,4,5,6,3,7,6};
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int sum =a+b;
            int total =0;
            while(sum >0){
                int rem = sum %10;
                total += arr[rem];
                sum /= 10;
            }
            System.out.println(total);


        }
    }
}
