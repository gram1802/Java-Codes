import java.util.*;

public class FindOddOccNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //          x ^ 0 = x      and     x ^ x = 0 (x xor itself a even number of times)

        int xor = arr[0];

        for(int i=1; i<arr.length; i++){
            xor = arr[i] ^ xor;
        }

        System.out.println("The element which repeats odd number of times is : " + xor);
         
    }
    
}
