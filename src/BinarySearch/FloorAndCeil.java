package BinarySearch;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 23 , 28 , 32 ,35 ,39,41 ,64,75};
        System.out.println("enter the target");
        int target = sc.nextInt();
        int[] result = FindFloorAndCeil(arr , target);
        System.out.println("Floor = " + result[0] + "  Ceil = " + result[1]);
    }
    public static int[] FindFloorAndCeil(int[] arr , int target){
        int floor = FindFloor(arr , target);
        int ceil = FindCeil(arr , target);
        return new int[] {floor , ceil} ;
    }

    public static int FindFloor(int[] arr ,int target){
        int low = 0 ; int high = arr.length-1; int ans = -1;
         while(low <= high){
             int mid = (low + high)/2;
             if(arr[mid] <= target){
                 ans = arr[mid];
                 low =mid +1 ;
             }
             else{
                 high = mid -1;
             }
         }
         return ans;
    }

    public static int FindCeil(int[] arr ,int target){
        int low = 0 ; int high = arr.length-1; int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = arr[mid];
                high =mid -1 ;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}
