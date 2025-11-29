package Recursion;

public class ReverseArray {
    public static void reverse(int[] arr , int l , int r){
        if( l >= r){
            return ;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse( arr , l+1 , r-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};
        reverse( arr,0 , arr.length-1);

        for(int i = 0 ; i< arr.length-1 ; i++){
            System.out.println(arr[i]);
        }
    }
}
