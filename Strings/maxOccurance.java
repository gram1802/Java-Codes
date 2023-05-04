package Strings;
import java.util.*;

public class maxOccurance {
    public static void main(String[] args) {
        int max;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int arr[] = new int[128];

        for(int i=0; i<s.length();i++){
            arr[s.charAt(i)-0]++;
        }


        max = 0;


        List<Character> all = new ArrayList<>();
       
        boolean flag = true;

        for(int i=1;i<s.length();i++){
            if(arr[s.charAt(i)-0]>arr[s.charAt(max)-0]){
                max = i;
            }
        }

        if(max==0){
            for(int i=0; i<s.length(); i++){
                if(arr[s.charAt(max)-0] == arr[s.charAt(i-0)]){
                if(s.charAt(max) != s.charAt(i))
                    flag = false;
            }
            }
        }

        all.add(s.charAt(max));


        for(int i =0; i<s.length(); i++){
            if(!all.contains(s.charAt(i)) && arr[s.charAt(i)-0] == arr[s.charAt(max)-0]){
                all.add(s.charAt(i));
            }
        }



        if(flag){
            System.out.println("Maximum occuring character(s) : " + all);
            
        }
        else{
           
            System.out.println("All characters occur same number of times");
        }

    }
    
}
