package Recursion;

public class FindLargest {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 867, 43, 6};
        System.out.println(findLargest(arr));
    }
}
