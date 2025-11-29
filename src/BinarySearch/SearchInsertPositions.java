package BinarySearch;

import java.util.Scanner;

public class SearchInsertPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2 , 5 ,7, 8, 10 , 12, 14, 15};
        System.out.println("enter the target to be inserted");
        int target = sc.nextInt();
        int result = SearchPosition(arr , target);
        System.out.println("the index where to insert ->" + result + " , value at index ->" + arr[result]) ;
    }

    public static int SearchPosition(int[] arr , int target){
        int low =0;
        int high = arr.length-1;
        int ans  = arr.length;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
