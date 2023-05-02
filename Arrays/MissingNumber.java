package array;

public class MissingNumber {
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,5,6,7};
        int n = arr.length;

  

        int expected = ((n+1)*(n+2))/2;  // use this formula to handle the case if the last element is missing 

        int sum = 0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        int ans = expected-sum;
        System.out.println(ans);
    }
    
}
