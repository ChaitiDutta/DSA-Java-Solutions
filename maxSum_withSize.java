// Find minimum subarray sum of specified size
// Example:
// Input :
// nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
// Output:
// Sub-array size: 4
// Sub-array from 0 to 3 and sum is: 10

import java.util.ArrayList;
import java.util.List;

public class maxSum_withSize {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int k = 3;
        int windowSum = 0;
        
        int res_Start = 0;
        int res_end = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<k; i++ ){
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for(int i =k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k];
            if(windowSum > maxSum){
                maxSum = windowSum;
                res_Start = i-k +1;
                res_end = i;
            }
        }

        for(int i = res_Start; i<=res_end; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(maxSum);


    }
}
