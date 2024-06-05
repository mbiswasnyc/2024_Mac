package class_work2024;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 9;
        nums[3] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[3]);    //default value of int is zero(0)
        int result = nums[0]+nums[3];
        System.out.println(result);

        int[] numbers = {12,3,56,4,3,2};
        System.out.println(numbers[3]);
        System.out.println(numbers.length);
    }
}
