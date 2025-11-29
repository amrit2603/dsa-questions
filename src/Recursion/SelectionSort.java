package Recursion;

public class SelectionSort {
    public static void selectionSorting(int[] arr , int n){
        for(int i = 0 ; i<= n-2 ; i++){
            int mini = i ;
            for(int j = i ; j<= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini] ;
            arr[mini] = temp ;
        }
    }

    public static void main(String[] args) {
    int[] arr = {23 ,4 ,6 ,87,9 , 19} ;
    int n = arr.length ;
    selectionSorting(arr, n) ;
    for(int i = 0; i< n ; i++) {
        System.out.println(arr[i]);
    }
    }
}
