package problems;

import java.util.Scanner;

public class howManyPairInArray {
    public static void main(String[] args) {

        int[] nums = {1,5,4,2,4,7,2,4,9,2,12,5,2,6,7};
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantity of which number you want to see?");
        int num = scan.nextInt();

        int numberOfn=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==num){
                numberOfn++;
            }
        }
        System.out.println("There are "+numberOfn+" "+num+"s in this Array.");
    }
}
