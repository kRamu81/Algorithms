package Streams;
import java.util.*;
public class AvgOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
//average() -> returns optimalDouble
