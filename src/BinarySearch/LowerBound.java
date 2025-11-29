package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 7, 10, 14, 21, 23, 31};
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int result = LowerBound(arr, target);
        System.out.println("Lower bound index: " + result + ", Value: " + arr[result]);
    }

    public static int LowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans ;
    }
}
