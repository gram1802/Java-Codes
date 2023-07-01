package DivideAndConquer;

public class PeakElement {


    static int findPeak(int[] arr, int l, int h){


            int m = (l+h)/2;
            
            if( m==0 && arr[m] > arr[m+1]  || m==arr.length-1 && arr[m] > arr[m-1]){
                return(arr[m]);
            }

            else if( (m<arr.length-1 && arr[m] > arr[m+1]) && (m>0 && arr[m] > arr[m-1])){
                return(arr[m]);
            }
            

            else if( m>0 && arr[m-1] > arr[m] ){
                return findPeak(arr, l, m-1);
            }
            
            return  findPeak(arr, m+1, h);
            

    
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,1,3,5,6,4};

        System.out.println(findPeak(nums, 0, nums.length));
        

    }
    
}
