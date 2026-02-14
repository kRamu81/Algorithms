package Streams;
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
//.max() -> returns optimalInt
//getAsInt() -> extracts the value