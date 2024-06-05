package problems;

public class ArraySum {
    public static void main(String[] args) {

        //10. Find out sum of all the index value of an Array

        int[] nums={12,3,4,6,9,3,4};
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
