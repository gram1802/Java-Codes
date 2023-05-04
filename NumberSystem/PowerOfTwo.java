
import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        
        int arr[] = new int[32];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        //A number ,which is a power of two, represented in binary form has only one bit which is high and the other bits are low
        /* Example

                4 -> 1000
                3 -> 0011

                4 & 3 = 0
            This is true for all numbers that are a power of two
         */

         if(n ==0)
            System.out.println("The number is not a power of two");
        else if((n & (n-1)) == 0)
            System.out.println("The number is a power of two");
        else
            System.out.println("The number is not a power of two");

    }
}
