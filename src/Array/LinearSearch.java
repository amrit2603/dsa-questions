package Array;

import java.util.Scanner;

public class LinearSearch {

    public int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 6, 8, 13, 21, 3};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        LinearSearch obj = new LinearSearch();
        int ans = obj.linearSearch(arr, target);

        System.out.println("Index: " + ans);
    }
}
