package BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2 , 4, 6, 6, 6, 7, 12 , 18 , 21 , 22};
        System.out.println("enter the target");
        int target = sc.nextInt();
        int result = Upperbound(arr , target);
        System.out.println("index is " + result + " , ele is" + arr[result]);
    }

    public static int Upperbound(int[] arr , int target){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length ;

        while(low <= high){
            int mid = (low + high) /2 ;

            if(arr[mid] > target){
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
