// 4. Maximum Subarray
// Given an integer array nums, find the contiguous subarray 
// (containing at least one number) which has the largest sum and return its sum.

// Example:
// Input: [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has sum = 6

import java.util.ArrayList;
import java.util.List;

public class maximum_subarray {
    public static void main(String[] args) {
        int[] num = {2, 3, -8, 7, -1, 2, 3};
        int maxEnding = num[0];
        int maxsofar = num[0];
        int currStart = 0; int res_Start = 0; int res_end = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<num.length; i++){
            if(maxEnding + num[i] < num[i] ){
                maxEnding = num[i];
                currStart = i;
            }else{
                maxEnding += num[i];
            }
            if(maxEnding > maxsofar){
                maxsofar = maxEnding;
                res_Start = currStart;
                res_end = i;
            }

        }
        for(int k = res_Start; k<= res_end; k++){
            list.add(num[k]);
        }
        System.out.println(list);

    }
}
