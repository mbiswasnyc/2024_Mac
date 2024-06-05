package problems;

import java.util.Scanner;

public class IfElseGrade {
    public static void main(String[] args) {
        //13. Marks 90-100-> grade A , 80-89-> grade B , 70-79 -> grade C ,
        // 60-69 -> grade D , 60-0 ->  Fail , and any other marks -> invalid

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number to see your Grade: ");
        int marks = scan.nextInt();

        if(marks<=100 && marks>=0){
            if(marks<=100 && marks>=90){
                System.out.println("A");
            } else if (marks<=89 && marks>=80) {
                System.out.println("B");
            } else if (marks<=79 && marks>=70) {
                System.out.println("C");
            } else if (marks<=69 && marks>=60) {
                System.out.println("D");
            }else {
                System.out.println("Fail");
            }

        }else{
            System.out.println("Invalid Marks");
        }
    }
}
