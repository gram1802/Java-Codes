package DivideAndConquer;

public class SelectionProcedure {

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


    static void selection(int[] arr, int l, int h,int k){
        
            int p = partition(arr, l, h);
            if(p == k-1){
                System.out.println(arr[p]);
            }  
            else if(p < k-1){
                selection(arr, p+1, h, k);
            } 
            else{
                selection(arr, l, p-1,k);
            }
        
    }
    
    public static void main(String[] args) {
        
        int arr[] = {10,50,20,70,60,30};
        int k = 6;  //3rd smallest element

        selection(arr, 0, arr.length-1, k);

    }
}
