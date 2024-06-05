package problems;
import java.util.Scanner;

public class IfElsePositiveNegative {
    public static void main(String[] args) {

        //02 find out any number given by console is a positive or negative

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();

        if(n<0){
            System.out.println(n+ " is a negative number");
        }else{
            System.out.println(n+ " is a positive number");
        }
    }
}
