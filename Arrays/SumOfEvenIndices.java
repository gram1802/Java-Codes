
import java.util.*;

public class SumOfEvenIndices {
    
    public static void main(String[] args) {

        int sum=0;
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                sum+=arr[i];
            }
        }

        System.out.println("Sum of elements present at even indices is: " + sum);

    }
}
