package DivideAndConquer;
import java.util.*;

class MedianOfTwoSortedArrays {

    public static double median(int[] arr1, int[] arr2){

        int length = arr1.length + arr2.length;
        int l = 0;
        int h = arr1.length;
        

        while(l<=h){

            int cut1 = (l+h)/2;
            int cut2 = (length+1)/2 -  cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2-1];
            
            int r1 = cut1 == arr1.length ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == arr2.length ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 <= r2 && l2 <= r1){
                if(length % 2 == 0){
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                h = cut1 - 1;
            }
            else{
                l = cut1 + 1;
            }

        }


        return 0.0;

    }

    public static void main(String[] args) {
        
        int[] a1 = {1,3,4,7,10,12};
        int[] a2 = {2,3,6,8};

        // int[] a1 = {2};
        // int[] a2 = {};

        //pass the smaller array first

        System.out.println(median(a2, a1));
        

        

    }

}   