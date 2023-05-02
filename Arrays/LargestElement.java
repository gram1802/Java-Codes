
import java.util.*;

public class LargestElement {
    
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);


    }
    
}
