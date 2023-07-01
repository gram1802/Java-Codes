package DivideAndConquer;

public class MergeSort {

    static void merge(int arr[], int l, int m, int h){
        
        int n1 = m - l + 1;
        int n2 = h-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i<n1; i++ ){
            left[i] = arr[l+i];
        }
        for(int i =0; i<n2; i++ ){
            right[i] = arr[m+i+1];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
    }

    static void mergesort(int a[], int l, int h){

        if(l<h){
            int m = l + (h-l)/2;
            mergesort(a,l,m);
            mergesort(a,m+1,h);
            merge(a,l,m,h);

        }
        
    }
    public static void main(String[] args) {
        
        int[] arr = {3,100,-8,8,0,-3,2};

        mergesort(arr,0,arr.length-1);

        System.out.println("The sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
