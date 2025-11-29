package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 6,7,8,9,10,0,1,2,3,4,5};
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int result = SearchInRotatedSortedArray(arr , target);
        System.out.println(result);
    }

    public static int SearchInRotatedSortedArray(int[]arr , int target){
        int low = 0; int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[low] <= arr[mid]){
               if(arr[low] <= target && target <= arr[mid]){
                   high = mid-1;
               }
               else{
                   low = mid +1 ;
               }
            }
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
