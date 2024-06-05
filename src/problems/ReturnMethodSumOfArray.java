package problems;

public class ReturnMethodSumOfArray {
    public static void main(String[] args) {

        int[] array = {12,4,6,2,9,19,45,6};

        System.out.println(getSum(array));
    }

    //Method
    public static int getSum(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }return sum;

    }
}
