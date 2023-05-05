import java.util.*;

public class CountNumOf1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in a sorted manner ( 0 or 1 ): ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int low=0;
        int high = arr.length-1;
        int res = arr.length;
        while(low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid] == 1){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid] == 0){
                low = mid + 1;
            }
        }

        int answer = arr.length - res;

        System.out.println("The number of 1's present in the array is : " + answer);

    }
    
}
