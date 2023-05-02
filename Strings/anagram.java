package stringss;
import java.util.*;

public class anagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();

        s1 = s1.replace(" ","");
        s1 = s1.toUpperCase();

        s2 = s2.replace(" ","");
        s2 = s2.toUpperCase();

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-65]++;
        }

        
        for(int i=0;i<s2.length();i++){
            arr2[s2.charAt(i)-65]++;
        }

        int i=0;
        int j=0;

       while(i<arr1.length && j<arr2.length){
        if(arr1[i] != arr2[j]){
            System.out.println("The words are not anagram of eachother");
            return;
        }
        i++;
        j++;
       }

       System.out.println("The words are anagram of eachother");


    }
}
