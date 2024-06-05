package problems;

import java.util.Scanner;

public class IfElseWeekdays {
    public static void main(String[] args) {
        //03 Write a program that will take number 1-7 and convert it to weekday

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int weekday = scan.nextInt();

        if(weekday==1){
            System.out.println("It is Monday");
        }else if(weekday==2){
            System.out.println("It is Tuesday");
        }else if(weekday==3){
            System.out.println("It is Wednesday");
        }else if(weekday==4){
            System.out.println("It is Thursday");
        }else if(weekday==5){
            System.out.println("It is Friday");
        }else if(weekday==6){
            System.out.println("It is Saturday");
        }else if(weekday==7){
            System.out.println("It is Sunday");
        }else{
            System.out.println("Invalid Number!");
        }

    }
}
