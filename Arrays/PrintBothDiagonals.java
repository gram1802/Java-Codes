package array;
import java.util.*;

public class PrintBothDiagonals {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows/columns : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j == n-1){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
