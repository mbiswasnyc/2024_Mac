package problems;
import java.util.Scanner;

public class IfElseOddEven {
    public static void main(String[] args) {

        //01. find out any number given by console is odd or even

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();

        if(n%2==0){
            System.out.println(n+ " is an even number!");
        }else{
            System.out.println(n+ " is an odd number!");
        }
    }
}
