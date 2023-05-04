import java.util.*;


//insertion sort in descending order

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("The array sorted in desceding order : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }



    }
}