package problems;

public class ForLoopSumOfEvenNumber {
    public static void main(String[] args) {

        //04 Make a for loop and print all the even number in the range and make summation of them

        int sum=0;

        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i);
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
