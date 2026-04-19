// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

 

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2

import java.util.HashMap;

public class leetcode_560{
    public static void main(String[] args) {
        int[] arr = {1,-1,1,-1}; int curr_sum = 0; 
        int sum = 0; int count = 0;
        var map = new HashMap<Integer, Integer>();
        map.put(0, 1); 
        for(int i = 0; i< arr.length; i++){
            curr_sum += arr[i]; //0+1 = 1 // 1+(-1)= 0//0+1 = 1 //1+(-1) = 0
            if(map.containsKey(curr_sum - sum)){ //0-0 = 0
                // count++; //1
                count += map.get(curr_sum - sum); //4
                
            }
            map.put(curr_sum, map.getOrDefault(curr_sum, 0)+1);//0,2// 1,2
           
        }
        System.out.println(count);
    }
}