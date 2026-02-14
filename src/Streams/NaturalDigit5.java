package Streams;
import java.util.*;
import java.util.stream.Stream;
//print first N natural Numbers containing the digit 5
public class NaturalDigit5 {
    public static void main(String[] args) {
        Stream.iterate(1,x -> x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);
    }
}
//iterate : creates the infinite stream
//ilter() : selects number containg 5
//limit(10) : takes first 10 results