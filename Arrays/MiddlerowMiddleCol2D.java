package array;
import java.util.*;

public class MiddlerowMiddleCol2D {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows/columns : ");  // assume array to be sqaure matrix with odd dimensions
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for(int i=0; i<n; i++){
            System.out.println(arr[i][n/2]);
        }

        for(int i=0; i<n; i++){
            if(i==n/2)
            continue;
            System.out.println(arr[n/2][i]);
        }

    }
}
