package Streams;
import java.util.*;
public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {12,13,14};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
//Arrays.stream(arr) ==> creates an intstream
// sum() returns total of elements