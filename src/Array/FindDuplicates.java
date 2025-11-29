package Array;

public class FindDuplicates {
    public static int FindDuplicatess(int[] arr){
        int ans = 0;

        for(int i=0 ;i<arr.length;i++){
            ans = ans ^ arr[i] ;
        }

        for(int i=1;i<arr.length;i++){
            ans = ans ^ i ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {11 ,21 , 31, 47 ,15, 21};
        System.out.println(FindDuplicatess(arr)) ;
    }
}
