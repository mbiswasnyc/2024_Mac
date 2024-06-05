package ExamMay21;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int n1 = scan.nextInt();

        System.out.println("Please enter 2nd number: ");
        int n2 = scan.nextInt();

        if(n1>50 && n1<100 && n2>50 && n2<100){
            if(n1>n2){
                System.out.println(n1+" is the bigger number.");
            }else{
                System.out.println(n2+" is the bigger number.");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
