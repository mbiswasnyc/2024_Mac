package problems;

public class ArrayHighestValue {
    public static void main(String[] args) {

        //11. Find the highest value inside an Array

        int[] nums = {12,39,16,29,7,9,21,34,6,5,11};
        int highest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(highest<nums[i]){
                highest = nums[i];
            }
        }
        System.out.println("The highest value in this Array is: "+highest);
    }
}
