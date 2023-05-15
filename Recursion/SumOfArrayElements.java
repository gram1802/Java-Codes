package Recursion;
import java.util.*;

public class SumOfArrayElements {

        public static int sum(int arr[], int n, int sum){

            if(n==arr.length)
                return sum;
            sum = sum + arr[n];
            return sum(arr,n+1,sum);


    
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements :");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The sum of elements is:  ");
            System.out.println(sum(arr,0,0));
            
        }
    
}
