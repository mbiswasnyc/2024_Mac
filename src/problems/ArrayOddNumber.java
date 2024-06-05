package problems;

public class ArrayOddNumber {
    public static void main(String[] args) {

        //12. Print only Odd numbers from an Array

        int[] nums = {12,3,43,5,67,6,9,5,2,4,11};

        for(int i=0; i<nums.length; i++){
            if (nums[i]%2==1){
                System.out.println(nums[i]);
            }
        }
    }
}
