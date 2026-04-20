// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

// Input: nums = [0,1,1,1,1,1,0,0,0]
// Output: 6
// Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

import java.util.HashMap;

public class leetcode_525 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,0,0}; int curr_sum = 0;
         int maxLen = 0; int lenSoFar = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                arr[i]= -1;
            }
            if(arr[i] == 1){
                arr[i] = 1;
            }
        }
        var map = new HashMap<Integer, Integer>();
        map.put(0, -1); // sum, index
        for(int j = 0; j<arr.length; j++){
            curr_sum += arr[j]; // 0 //0+1=1//2//3//4//5-1=4//4-1=3//3-1=2
            if(map.containsKey(curr_sum)){ //3
                lenSoFar = j - map.get(curr_sum); //7-4=3
            }
            map.putIfAbsent(curr_sum, j); //-1,0//0,1//1,2//2,3//3,4//4,6//3,7
    //Use putIfAbsent() instead of put() because earliest index gives maximum length.
            maxLen = Math.max(maxLen, lenSoFar);//3
        }
        System.out.println(maxLen);
    }
}
