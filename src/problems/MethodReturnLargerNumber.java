package problems;

public class MethodReturnLargerNumber {

    //20. Write a method which will take 2 arguments and return larger value between them
    public static void main(String[] args) {
        int q = 100;
        System.out.println(returnLargerValueFromTwo(344,23)-q);

        //------OR-------

        int r = 100;
        int s = returnLargerValueFromTwo(344,23);
        System.out.println(s-r);
    }
    //Method
    public static int returnLargerValueFromTwo(int n1, int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
}
