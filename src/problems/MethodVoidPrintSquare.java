package problems;

public class MethodVoidPrintSquare {
    //18. Write a method which will take an int value and print square of it
    public static void main(String[] args) {
        squareMethod(9);
    }
    //Method
    public static void squareMethod(int n){
        int sq = n*n;
        System.out.println("Square of "+n+" is : "+sq);
    }
}
