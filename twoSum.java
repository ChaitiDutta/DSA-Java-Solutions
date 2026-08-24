// Problem:
// Given an array of integers nums and an integer target, return indices 
// of the two numbers such that they add up to target.

// You may assume each input has exactly one solution.
// You may not use the same element twice.
// Return the answer in any order.

// Example:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: nums[0] + nums[1] = 2 + 7 = 9

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args){
        int[] num = {5,9,715,1,2,3,4,5,6,7,8,9};
        var map = new HashMap<Integer,Integer>();
        int t = 9;

        for(int i = 0; i<num.length; i++){
            int r = t- num[i];//2
            if(map.containsKey(r)){ //2?
                System.out.println(map.get(r) + ", " + i);
            }
            map.put(num[i],i ); //(2,0)
            
        }



        // int[] num = {3,3};
        // int target = 6;
        
        // var mapValue = new HashMap<Integer, Integer>();

        // for(int i =0; i<num.length; i++){
        //     int required = target - num[i];
        //     if(mapValue.containsKey(required)){
        //         System.out.println("indeces :" + mapValue.get(required) + ", "+ i);
        //         break;
        //     }else{
        //           mapValue.put(num[i], i);
        //     }

        // }

    }

}
