package Recursion;
import java.util.*;
public class SumOfDigits {

    public static int sum(int n){

        if(n==0)
            return 0;
        else    
            return (n%10) + sum(n/10);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("The sum of digits is: ");
        System.out.println(sum(n));


    }
}