import java.util.*;

// Sorting in descending order

public class LinearSearch {

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
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                flag=true;
                System.out.println("The element is present at index " + i);
                break;
            }
        }

        if(flag==false){
            System.out.println("element not found");
        }

    }
}