package pattern;

public class triangleOfPrimeNumbers {

    static boolean prime(int num){

       boolean flag = false;

       for(int i=2;i<num;i++){
        if(num%i == 0){
            flag=true;
            break;
        }
       }

       return flag;
       

       
    }

    public static void main(String[] args) {
        
        int n=6;
        int num=2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                
                    while(prime(num) == true){
                        num++;
                        prime(num);
                    }
                    System.out.print(num + " ");
                     num++;
                
                
            }
            System.out.println();
        }
    }
    
}
