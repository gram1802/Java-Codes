package Recursion;
import java.util.*;

public class SumWithAlternateSigns {

        public static int sum(int n){

            int sum=0;

            if(n==1)
                return 1;
    
            if(n%2==0)
                return sum - n + sum(n-1);
            else    
                return sum + n + sum(n-1);
    
    
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println("The sum of N natural numbers is: ");
            System.out.println(sum(n));
        }
    
}
