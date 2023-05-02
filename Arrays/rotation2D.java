

public class rotation2D {

  

    public static void main(String[] args) {
        
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        for(int p = 0; p<arr.length; p++){
            for(int q=p; q<arr[0].length; q++){
                if(p!=q){
                    int t = arr[p][q];
                    arr[p][q] = arr[q][p];
                    arr[q][p] = t;
                }

            }
        }

        for(int i=0; i<arr.length; i++){
            int l = 0;
            int r = arr.length-1;
            while(l<r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }

        }
        

        for(int p = 0; p<arr.length; p++){
            for(int q=0; q<arr[0].length; q++){
                System.out.print(arr[p][q] + " ");
            }
            System.out.println();
        }
             

    }
    
}
