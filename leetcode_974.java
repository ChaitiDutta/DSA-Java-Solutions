// Given an integer array nums and an integer k, return the number of non-empty 
// subarrays that have a sum divisible by k.

// Input: nums = [4,5,0,-2,-3,1], k = 5
// Output: 7
// Explanation: There are 7 subarrays with a sum divisible by k = 5:
// [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

import java.util.HashMap;

public class leetcode_974 {
    public static void main(String[] args) {
        int[] arr = {-4,2,9};
        int k = 2;
        int curr_sum = 0;
        int count =0;
        var map = new HashMap<Integer, Integer>();

        map.put(0,1);
        for(int i = 0; i< arr.length; i++){
           curr_sum += (arr[i]);
           int rem = curr_sum % k;
           if(rem <0){ // this is problem that has negetive element;
            rem = rem + k;
           }
           if(map.containsKey(rem)){
            count += map.get(rem);
           }
           map.put(rem, map.getOrDefault(rem, 0)+1);
        }
       
        System.out.println(count);
    }
}
