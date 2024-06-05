package re_call;

public class LeapYear {

    public static void main(String[] args) {
        int count = 0;
        int yearNumber = 0;
        for(int i=1911; i<=2024; i++){
            if(i%4==0){
                count++;
                yearNumber++;

                System.out.println("Year "+yearNumber+" : "+i);
            }
        }
        System.out.println(count);


    }
}
