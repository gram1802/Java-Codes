package Strings;
import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ","");
        s = s.toLowerCase();
        int arr[] = new int[26];
        for(int i=0;i<s.length(); i++){
            arr[s.charAt(i) - 97]++;
        }

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97] > 1){
                System.out.println(s.charAt(i));
            }
            arr[s.charAt(i)-97] = -1;
        }

    }
}
