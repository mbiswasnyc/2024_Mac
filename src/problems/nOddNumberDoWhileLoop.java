package problems;

import java.util.Scanner;

public class nOddNumberDoWhileLoop {

    //15. Print n number of odd numbers, n from user
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many Odd number you want to see: ");
        int n = scan.nextInt();
        int i =0;
        int count =0;
        do{
            if(i%2==1){
                System.out.println(i);
                count++;
            }
            i++;
        }while(n!=count);
    }
}
