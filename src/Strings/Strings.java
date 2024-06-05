package Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {/*
        String[] countries = {"Bangladesh", "USA", "Andaman"};
        int count=0;
        for(int i=0; i< countries.length; i++){
            for(int j=0; j<countries[i].length(); j++){
                if(countries[i].charAt(j)=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);*/
        String[] countries = {"Bangladesh", "USA", "Andaman"};
        String name= countries[0];

        for (int i = 0; i<countries.length; i++){
            if(name.length() < countries[i].length()){
                name= countries[i];
            }
        }
        System.out.println(name);
    }
}
