package problems;

public class ForLoopSumAndBreak {
    public static void main(String[] args) {

        //07
        // a) Run a for loop i<100 and get the sum.
        //b) Stop the loop when the sum reaches 3000. Print  which number is that

        //a)
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //b)
        sum = 0;
        for(int j=0; j<=100; j++){
            sum = sum + j;
            if(sum>3000){
                System.out.println(j);
                break;
            }
        }
        System.out.println(sum);
    }
}
