package Strings;

public class HowManyChr {
    public static void main(String[] args) {
        String[] countries = {"Bangladesh", "Usa", "Australia", "India", "France"};


        int count=0;
        for(int i=0; i<countries.length; i++){
            for(int j=0; j<countries[i].length(); j++){
                if(countries[i].charAt(j)=='n'){
                    count++;
                }
            }
        }
        System.out.println(count);

        /*int count=0;
        for(int i=0; i<countries.length; i++){
            count = count + countries[i].length();
        }
        System.out.println(count);*/
    }
}
