// Product of Array Except Self
// Given an integer array `nums`, return an array `answer` such that:
// `answer[i] = product of all elements except nums[i]`

// **Example:**
// Input: [1,2,3,4]
// Output: [24,12,8,6]

import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int[] num  = {1,2,3,4};
        int leftProduct = 1;
        int rightProduct = 1;
        int[] arr = new int[num.length];
        for(int i =  0; i<num.length; i++){
          arr[i] = leftProduct;
          leftProduct *= num[i];
        }
        for(int i = arr.length -1; i>=0; i--){
            arr[i] *= rightProduct;
            rightProduct *= num[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
