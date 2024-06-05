package class_work2024;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            System.out.println("Hello I: "+i);
            for(int j=1; j<=3; j++){
                System.out.println("    Hello J: "+j);
            }
        }
    }
}
