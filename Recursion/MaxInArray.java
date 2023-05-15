package Recursion;
import java.util.*;

public class MaxInArray {

        public static int max(int arr[], int num, int maxi){

            if(num == arr.length)
                return maxi;
         
            if(arr[num] > maxi)
                maxi = arr[num];

            return max(arr, num+1, maxi);

    
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
            System.out.println("The maximum element is:  ");
            System.out.println(max(arr,1,arr[0]));
            
        }
    
}
