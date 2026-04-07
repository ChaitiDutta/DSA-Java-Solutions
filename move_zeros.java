// Move Zeroes
// Given an integer array nums, move all 0s to the end while maintaining the 
// relative order of non-zero elements.
// Must do in-place.

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]

import java.util.Arrays;

public class move_zeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int left = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){ 
                arr[left] = arr[i];
                left++;
            }
        }
        for(int j = left; j< arr.length; j++){
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
