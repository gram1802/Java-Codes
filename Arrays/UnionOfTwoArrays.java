package array;
import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,2,0};


        int i=0;
        int j=0;

        ArrayList<Integer> arr = new ArrayList<>();
        int ind=0;

        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else{
                arr.add(a[i]);
                arr.add(b[j]);
                i++;
                j++;
            }
        }

        while(i<a.length){
            arr.add(a[i]);
            i++;
        }
        while(j<b.length){
            arr.add(b[j]);
            j++;
        }
        
    System.out.println(arr);
    
    }
}
