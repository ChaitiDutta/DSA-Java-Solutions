// 4. Maximum Subarray
// Given an integer array nums, find the contiguous subarray 
// (containing at least one number) which has the largest sum and return its sum.

// Example:
// Input: [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has sum = 6

public class maximum_sum {
    public static void main(String[] args) {
        int[] num = {2, 3, -8, 7, -1, 2, 3};
        int maxEnding = num[0] ; int maxsofar = num[0]; 
        for(int i =1; i<num.length; i++ ){
            maxEnding = Math.max(num[i], maxEnding+ num[i]);
            maxsofar = Math.max(maxEnding, maxsofar);
            
        }
        System.out.println(maxsofar);
    }
}
