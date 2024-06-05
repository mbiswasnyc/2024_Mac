package Strings;

public class String2 {
    public static void main(String[] args) {
        printStringLength("Bangladesh", 'a');

    }

    public static void printStringLength(String name, char ch){
        int count=0;

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
