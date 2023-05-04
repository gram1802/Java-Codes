package Strings;
import java.util.*;

import org.w3c.dom.CharacterData;

public class countNumberOf {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        int consonants = 0;
        int vowels = 0;
        int special = 0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else{
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Special Characters = " + special);


    }
    
}
