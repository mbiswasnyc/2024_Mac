package problems;

public class ForLoopPattern2 {
    public static void main(String[] args) {

        //09
        /*  *
            **
            ***
            ****
            *****   */

        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=5; k>=1; k--){
            for(int l=1; l<=k; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
