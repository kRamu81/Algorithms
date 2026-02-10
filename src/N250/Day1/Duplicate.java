package N250.Day1;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] nums = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Ans1(nums));
    }

    public static boolean Ans1(int[] nums) {

        long unique = Arrays.stream(nums)
                .distinct()
                .count();

        return unique < nums.length;
    }
}
