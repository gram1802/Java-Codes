import java.util.*;

// Sorting in descending order

public class bubblesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j+1]>arr[j]){
                    int t = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("The array sorted in descending order is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}