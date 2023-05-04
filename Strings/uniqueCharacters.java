package Strings;
import java.util.*;

public class uniqueCharacters{
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s= s.toLowerCase();

        for(int i=0; i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.println("The given string does not contain unique characters");
                    return;
                }
            }
        }

        System.out.println("The given string contains unique characters");

    }
}