// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that 
// i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode_15 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 0, 0, 0, 0 };
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int right = arr.length - 1;
            int left = i + 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(list);
        // list.clear();
    }
}
