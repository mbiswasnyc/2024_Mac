package problems;

public class ForLoopPattern1 {
    public static void main(String[] args) {

        //08    ########
        //	    ########
        //	    ########
        //	    ########
        //	    ########
        //	    ########
        //	    ########
        //	    ########

        for(int i=1; i<=8; i++){
            System.out.print("#");
            for(int j=1; j<=7; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
