package BinarySearch;

import java.util.Scanner;

public class BinarySearchOg {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = { 2 ,5 ,7 ,8 ,9, 10};
            System.out.println("Enter the target");
            int target = sc.nextInt();
            int result = BinarySearche(arr , target);
            System.out.println(result);

        }

        public static int BinarySearche(int[]arr , int target){
            int low = 0 ;
            int high = arr.length -1;
            while (low <= high) {
                int mid =low + (high-low) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }
