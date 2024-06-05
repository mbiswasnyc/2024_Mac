package problems;

public class MethodVoidPrintLargerValue {
    //19. Write a method which will take 2 arguments and print larger value between them
    public static void main(String[] args) {
        largerValueFromTwo(223,56);
    }
    //Method
    public static void largerValueFromTwo(int n1, int n2){
        if(n1>n2){
            System.out.println(n1+ " is Larger");
        }else{
            System.out.println(n2+ " is Larger");
        }
    }
}
