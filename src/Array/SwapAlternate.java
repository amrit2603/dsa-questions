package Array;

public class SwapAlternate {
    public static void swappi(int[] arr){
        for(int i = 0 ; i<= arr.length ;i+=2) {
            if (i + 1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1 ,5 ,7 ,3 ,9};
        swappi(arr);
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
