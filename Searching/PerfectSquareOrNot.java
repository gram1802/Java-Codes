import java.util.*;
public class PerfectSquareOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }

        int low=0;
        int high=arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((arr[mid] * arr[mid]) == n){
                res = arr[mid];
                break;
            }
            else if((arr[mid] * arr[mid]) > n)
                high = mid - 1;
            else    
                low = mid + 1;
                
        }

        if(res == -1){
            System.out.println("false");
        }
        else{
            System.out.println("true " + res);
        }



    }
}