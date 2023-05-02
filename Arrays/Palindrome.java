package array;
public class Palindrome{

    public static void main(String args[]){

        int[] arr = {1,2,3,4,2,1};
        int n=arr.length;
        boolean ans=true;
        for(int i=0; i<n/2; i++){
            if(arr[i] != arr[n-1-i]){
                ans=false;
                break;
            }
        }

        if(ans==true)
            System.out.println("It is a palindrome array");
        else    
            System.out.println("It is not a palindrome array");

    }

}