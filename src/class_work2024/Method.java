package class_work2024;

public class Method {
    public static void main(String[] args) {

      add();
      addWithArguments(3,6);

    }

    public static void add(){
        int a = 5;
        int b = 9;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void addWithArguments(int a, int b){
        int sum = a + b;
        System.out.println("With arguments: "+sum);
    }
}
