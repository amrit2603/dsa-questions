package Array;

public class SecondLargetElement {

        public int secondLargestElement(int[] nums) {

            // Check if the array has less than 2 elements
            if (nums.length < 2) {
                // If true, return -1 there is no second largest element
                return -1;
            }

        /* Initialize variables to store the
        largest and second largest elements */
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

        /*Single traversal to find thelargest
       and second largest elements*/
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                }
                else if (nums[i] > secondLargest && nums[i] != largest) {
                    secondLargest = nums[i];
                }

            }

            // Return the second largest element
            return secondLargest == Integer.MIN_VALUE ?  -1 : secondLargest;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 4, 7, 7, 5};

            //Creating the instance of the Solution class
            SecondLargetElement sol=new SecondLargetElement();

            int n = nums.length;

        /* Call the method to find
        the second largest element*/
            int sL = sol.secondLargestElement(nums);

            System.out.println("Second largest is " + sL);
        }
    }

