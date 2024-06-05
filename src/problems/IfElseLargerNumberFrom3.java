package problems;

import java.util.Scanner;

public class IfElseLargerNumberFrom3 {
    public static void main(String[] args) {

        //05 Write a program that will find the larger number from 3  number

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int n1 = scan.nextInt();

        System.out.println("Please enter 2nd number: ");
        int n2 = scan.nextInt();

        System.out.println("Please enter 3rd number: ");
        int n3 = scan.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is the larger number.");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+ " is the larger number.");
        }else{
            System.out.println(n3+ " is the larger number.");
        }
    }
}
