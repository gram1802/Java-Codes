package array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10};
        int n=arr.length;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int p=0; p<n; p++){
            System.out.print(arr[p] + " ");
        }


    }


}
