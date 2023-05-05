import java.util.*;
public class CountDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in a sorted manner ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to count ");
        int num = sc.nextInt();


// find the starting index of the number


        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == num){
                res = mid;
                high = mid - 1;
            }
            else if(arr[mid]>num)
                high = mid -1;
            else
                low = mid +1;
        }


// find the ending index of the number

        int low1=0;
        int high1=arr.length-1;
        int res2=-1;

         while(low1<=high1){
            int mid = low1 + (high1-low1)/2;
            if(arr[mid] == num){
                res2 = mid;
                low1 = mid + 1;
            }
            else if(arr[mid]>num)
                high1 = mid -1;
            else
                low1 = mid +1;
        }

        if(res==-1 && res2==-1){
            System.out.println("Element not in array");
        }
        else{
            
        int ans = res2 - res + 1;

        System.out.println("The frequency of occurance of the target is "+ ans);

        }


    }
}
