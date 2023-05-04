
import java.util.*;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        
        int arr[] = new int[32];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int i=0;
        while(n>0){
            arr[i] = n%2;
            n=n/2;
            i++;
        }
        

        for(int j=arr.length-1; j>=0; j--){
           
            System.out.print(arr[j]);
        }


        
    }
}
