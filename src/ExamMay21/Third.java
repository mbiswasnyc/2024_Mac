package ExamMay21;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Starting number of the loop: ");
        int start = scan.nextInt();
        System.out.println("Enter Ending number of the loop: ");
        int end = scan.nextInt();
        int count =0;
        for(int i=start; i<end; i++){
            if(i%3==0){
                System.out.println(i);
                count++;
                if(count==5){
                    break;
                }
            }
        }
    }
}


