package problems;

import java.util.Scanner;

public class ifThereAreTwo2oneAfterAnother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which numbers pair you are looking for?");
        int pairNum = scan.nextInt();
        int[] nums = {1,5,5,4,2,2,4,7,2,5,5,4,9,2,2,12,5,5,2,2,2,6,7};
        int count=0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == pairNum && nums[i+1] == pairNum){
                count++;
            }
        }
        System.out.println("There are "+count+" pair of "+pairNum+" in this Array");
    }
}
