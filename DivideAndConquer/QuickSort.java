package DivideAndConquer;

public class QuickSort {

    static int partition(int[] arr,int l, int h){

        int pivot=arr[l];
        int i = l;

        for(int j=i+1;j<=h;j++){
            if(pivot>=arr[j]){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int t = arr[l];
        arr[l] = arr[i];
        arr[i] = t;

        return i;

    }


    static void quickSort(int[] arr, int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);     
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {3,1,9,8,0,-3,2};

        quickSort(arr,0,arr.length-1);

        System.out.println("The sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
