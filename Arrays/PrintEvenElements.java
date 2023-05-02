package array;
import java.util.*;

public class PrintEvenElements{

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are: ");

        for(int i : arr){           //for-each loop
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

}