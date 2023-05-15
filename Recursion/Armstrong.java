package Recursion;
import java.util.*;
import java.lang.Math.*;

public class Armstrong {

    public static void Armstrong(int n, int digits,double sum,int ans){

        if(n==0){
            if(sum == ans){
                System.out.println("true");
                return;
            }
            else{
                System.out.println("false");
                return;
            }
        }
        
        
        sum += Math.pow(n%10, digits);
        Armstrong(n/10, digits, sum, ans);
       


    }
    

    public static void main(String[] args) {
    
        int digits=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        while(temp!=0){
            digits+=1;
            temp=temp/10;
        }
        Armstrong(n, digits, 0, n);
        
    }
}
