package N250.Day1;

import java.util.*;
import java.util.stream.IntStream;

public class Concat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] nums = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(Ans(nums)));
    }

    public static int[] Ans(int[] nums) {

        return IntStream.concat(Arrays.stream(nums),
                        Arrays.stream(nums))
                .toArray();
    }
}
