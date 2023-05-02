package pattern;


public class alphabetDiamondPattern {

    public static void main(String[] args) {

        int n=8;
        int alpha = 65;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i+j>=n/2 && i-j<=n/2 && i+j<=12 && j-i<=n/2){
                    char c = (char)(alpha);
                    System.out.print(c);
                    alpha++;
                }
                else
                    System.out.print(" ");
            }
            alpha=65;
            System.out.println();
        }

        
    }
    
    
}

