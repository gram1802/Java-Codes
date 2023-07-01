package DivideAndConquer;

public class SearchInRotatedArray {


    static int findPivot(int[] arr, int l, int h){

            if(l<=h){
                
                int m = (l+h)/2;
                if(m<arr.length-1 && arr[m] > arr[m+1]) {
                    return m;
                }
                else if(m>0 && arr[m-1] > arr[m]){
                    return m-1;
                }
                else if(arr[m] <= arr[l])
                    return findPivot(arr, l, m-1);
                else{
                    return findPivot(arr, m+1, h);
                }

            }

            return -1;
           
    }

    static int search(int[] arr, int l, int h, int key){
        if(l<=h){
            int m = (l+h)/2;
            if(arr[m] == key){
                System.out.println(m);
            }
            else if(arr[m] > key){
                return search(arr,l,m-1,key);
            }
            else{
                return search(arr,m+1,h,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10};

        int key = 5;

        int cut = findPivot(arr, 0, arr.length-1);
      
        if(cut==-1){
            search(arr,0,arr.length-1,key);
        }
        else if(arr[cut] == key){
            System.out.println(cut);
        }
        
        else if(key>=arr[0]){
            search(arr,0,cut-1, key);
        }
        else{
            search(arr,cut+1,arr.length-1,key);
        }
    }
    
}
