package stringss;
import java.util.*;

public class removeDuplicates{
  
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ", "");
        s = s.toUpperCase();
        int alpha[] = new int[26];
        String ans = " ";
        for(int i=0; i<s.length(); i++){
            alpha[s.charAt(i)-65]++;
        }
        for(int i=0; i<s.length(); i++){
            if(alpha[s.charAt(i)-65] != -1){
                ans = ans + s.charAt(i); 
            }
            alpha[s.charAt(i)-65] = -1;
        }

        System.out.println(ans);




    }

}






