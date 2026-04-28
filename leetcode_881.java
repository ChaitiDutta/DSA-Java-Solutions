// You are given an array people where people[i] is the weight of the ith person, 
// and an infinite number of boats where each boat can carry a maximum weight of 
// limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
// Return the minimum number of boats to carry every given person.
// Input: people = [3,2,2,1], limit = 3
// Output: 3
// Explanation: 3 boats (1, 2), (2) and (3)
//TOPIC - Greedy + two pointer

import java.util.Arrays;

public class leetcode_881 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int limit = 4;
        int count = 0;
        while(left <= right){
            if(arr[left] + arr[right] <= limit){
                count++;
                left++;
                right--;
            }else{
                count++;
                right--;
            }
        }
        System.out.println(count);
    }
}
