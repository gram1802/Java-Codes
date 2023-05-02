
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        if(n<2)
            System.out.println("there must exist at least two elements");
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int maxi=0;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi,arr[i]);
        }

        int res=0;
        for(int i=0; i<n; i++){
            if(arr[i] != maxi)
            res = Math.max(res,arr[i]);
        }

        System.out.println("The second largest element is " + res);

        


    }
}