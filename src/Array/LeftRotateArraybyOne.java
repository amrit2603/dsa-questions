package Array;

class LeftRotateArraybyOne {
    public void rotateArrayByOne(int[] nums) {
        // Store the first element in a temporary variable
        int temp = nums[0];

        // Shift elements to the left
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        // Place the first element at the end
        nums[nums.length - 1] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        LeftRotateArraybyOne solution = new LeftRotateArraybyOne();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
