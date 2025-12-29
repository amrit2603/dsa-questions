package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3 , 1, 2 ,3 , 3, 3, 3};
        System.out.println("Enter the target");
        int target = sc.nextInt();
        boolean result = SearchInRotatedSortedArray2(arr , target);
        System.out.println(result);
    }

    public static boolean SearchInRotatedSortedArray2(int[] arr , int target){
        int low = 0 ; int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }

            if(arr[low] == arr[mid] && arr[mid]==arr[high]){
                low = low +1 ;
                high = high -1 ;
                continue;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1 ;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid +1 ;
                }else{
                    high = mid -1 ;
                }
            }
        }
        return false;
    }
}
