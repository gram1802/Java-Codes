package Patterns;
public class Question4 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 && i<=n  || i==0 && j<(n-1)/2 || j==(n-1)/2 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0; j<n; j++){
                if(j==n-1 && i<=n || i+j==(n-1) && i<n && j<(n-1)/2 || i==j && j>(n-1)/2 && j<n || j==0 && i<=n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        
            System.out.print("                           ");
            for(int j=0; j<n; j++){
                if(i==0 && j!=0  && j<n-3 || j==0 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j<n-3 || j==n-3 && i>(n-1)/2 && i<n || i==n-1 && j<n-3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i+j==(n-1)/2 || i-j==(n-1)/2 || j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0; j<n; j++){
                if(j==0 && i<n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0; j<n; j++){
                if(j==0 && i<n || i==n-1 && j<n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for(int j=0; j<n; j++){
                if(j==0 && i<n || i==(n-1) && j<n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(i==0 && j!=0  && j<n || j==0 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j<n || j==n-1 && i>(n-1)/2 && i<n|| i==(n-1) && j<n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
