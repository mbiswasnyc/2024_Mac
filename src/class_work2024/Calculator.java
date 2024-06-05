package class_work2024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operator = 0;
        double n1 = 0.0;
        double n2 = 0.0;
        double result;
        do {
            System.out.println("What you want to do?");
            System.out.println("1->Add , 2->Sub , 3->Multi , 4->Div , 5->EXIT");
            operator = scan.nextInt();

    switch (operator) {
        case 1:
            System.out.println("Enter 1st number: ");
            n1 = scan.nextDouble();
            System.out.println("Enter 2nd number: ");
            n2 = scan.nextDouble();
            System.out.println("Add = " + (n1 + n2));
            break;
        case 2:
            System.out.println("Enter 1st number: ");
            n1 = scan.nextDouble();
            System.out.println("Enter 2nd number: ");
            n2 = scan.nextDouble();
            System.out.println("Sub = " + (n1 - n2));
            break;
        case 3:
            System.out.println("Enter 1st number: ");
            n1 = scan.nextDouble();
            System.out.println("Enter 2nd number: ");
            n2 = scan.nextDouble();
            System.out.println("Mul = " + (n1 * n2));
            break;
        case 4:
            System.out.println("Enter 1st number: ");
            n1 = scan.nextDouble();
            System.out.println("Enter 2nd number: ");
            n2 = scan.nextDouble();
            System.out.println("Div = " + (n1 / n2));
            break;
        case 5:
            System.out.println("Go 2 Hell!");
            System.exit(0);
            break;
        default:
            System.out.println("Invalid Number !");
            }

        }while (operator!=5) ;
    }
}
