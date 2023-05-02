package stringss;

public class palindrome {
    public static void main(String[] args) {
        String s = "2552";
        String snew = "";
        for(int i=s.length()-1;i>=0;i--){
            snew = snew + s.charAt(i);
        }
        if(s.equals(snew)){
            System.out.println("The given string is a palindrome");
        }
        else
            System.out.println("The given string is not a palindrome");
    }
    
}
