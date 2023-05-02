
import java.util.*;


public class Array2DPrinting {
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns :" );
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];
        System.out.println("Enter the elements");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even =0;
        int zero = 0;

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){

                if(arr[i][j] > 0){
                    pos++;
                }
                if(arr[i][j] < 0){
                    neg++;
                }
                if(arr[i][j] == 0){
                    zero++;
                }
                if(arr[i][j]%2==0){
                    even++;
                }
                if(arr[i][j]%2!=0){
                    odd++;
                }
                
            }
        }


        System.out.println("Number of positive numbers : " + pos);
        System.out.println("Number of negative numbers : " + neg);
        System.out.println("Number of odd numbers : " + odd);
        System.out.println("Number of even numbers : " + even);
        System.out.println("Number of zero : " + zero);


        

    }
}
