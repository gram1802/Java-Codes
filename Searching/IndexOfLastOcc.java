import java.util.*;

public class IndexOfLastOcc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you are searching for: ");
        int num = sc.nextInt();
        int low=0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid] == num){
                res = mid;
                low = mid+1;
            }
        
            else if(arr[mid] > num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }

        System.out.println("The last occurrence of target is at index : " + res);

    }
}
