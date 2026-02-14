package Streams;
import java.util.*;
public class StartingAendingC {
    public static void main(String[] args) {
        String[] arr = {"abc","cde","ac","aec","xy3"};
        Arrays.stream(arr)
                .filter(x->x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);

    }
}

//Two Filter() conditions applied
//sorted() -> sorted Lexicographically

