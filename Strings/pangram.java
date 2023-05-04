package Strings;
import java.util.*;

public class pangram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        s1 = s1.replace(" ","");
        s1 = s1.toUpperCase();

        int arr1[] = new int[26];

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-65]++;
        }

    

        int i=0;
        while(i<arr1.length){
            if(arr1[i]==0){
                System.out.println("This is not a pangram");
                return;
            }
            i++;
        }

        System.out.println("This is a pangram");



    }
}
