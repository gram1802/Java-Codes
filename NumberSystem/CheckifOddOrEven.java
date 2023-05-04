
import java.util.*;

public class CheckifOddOrEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        /*
             Number = 8            1  0  0  0    - Representation of  8 in Binary Format
             Bitwise AND           0  0  0  1    - Representation of  1 in Binary Format
                       
                                   0  0  0  0    - Representation of  0 in Binary Format
            
            
            Result- Number was even so bitwise And by 1 is 0  

         */

         if( (n&1) == 0)
            System.out.println("It is a even number");
        else    
            System.out.println("It is a odd number");

    
        
        

    }
    
}
