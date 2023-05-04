import java.util.*;


//selection sort in descending order

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int max = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            if(max != i){
                int t = arr[i];
                arr[i] = arr[max];
                arr[max] = t; 
            }
        }

        System.out.println("The array in descending order : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }


    }
}
