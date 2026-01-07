package Array;

import java.util.Scanner;

public class FindLargest {

    public int largestElement(int[] nums) {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 8, 13, 21, 3};

        FindLargest obj = new FindLargest();   // create object

        int largest = obj.largestElement(arr); // call via object

        System.out.println("Largest element: " + largest);
    }
}
