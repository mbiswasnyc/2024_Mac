package re_call;

public class Array {
    public static void main(String[] args) {
        int sum =0;
        int[] nums = {2,9,8,6,25,7,5,3,9};
        for(int i = 0; i<nums.length; i++){
            sum=sum+nums[i];
            if(sum>50){
                System.out.println(nums[i]);
                break;
            }
        }
        System.out.println(sum);
    }
}
