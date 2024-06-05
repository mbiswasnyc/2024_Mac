package problems;

public class OddNumberNtimes {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("How many Odd number you want to see : ");
        int n = scan.nextInt();

        for(int i=0; i<=(n*2); i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }*/

        int[] nums={2,3,5,2,2,1,2,7,2,2,6,9,2,5,7,2};
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==2 && nums[i+1]==2){
                count++;
            }
        }
        System.out.println(count);




    }
}
