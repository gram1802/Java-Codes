package DivideAndConquer;

public class MaximaAndMinima {

    static class Pair{
        int minima;
        int maxima;
    }

    public static Pair find(int[] arr, int l, int h){
        Pair obj = new Pair();
        Pair left = new Pair();
        Pair right = new Pair();
        if(l==h){
            obj.minima = arr[l];
            obj.maxima = arr[l];
            return obj;
        }
        if(h-l == 1){
            if(arr[l] > arr[h]){
                obj.maxima = arr[l];
                obj.minima = arr[h];
            }
            else{
                obj.maxima = arr[h];
                obj.minima = arr[l];
            }
            return obj;
        }

        int m = (l+h)/2;
        left = find(arr,l,m-1);
        right = find(arr,m,h);

        if(left.minima < right.minima){
            obj.minima = left.minima;
        }
        else{
            obj.minima = right.minima;
        }
        if(left.maxima > right.maxima){
            obj.maxima = left.maxima;
        }
        else{
            obj.maxima = right.maxima;
        }

        return obj;

    }

    public static void main(String[] args) {

        int[] arr = {0,50,11,15,255,555};

        Pair ans = find(arr, 0, arr.length-1);

        System.out.println(ans.minima + " " + ans.maxima);
        
    }


}

