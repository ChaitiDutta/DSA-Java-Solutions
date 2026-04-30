// Given two strings s and t of lengths m and n respectively, return the minimum 
// window substring of s such that every character in t (including duplicates) is included in the window. 
// If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

package String;

import java.util.HashMap;

public class leetcode_76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int left = 0;
        int right = 0;
        int count = 0;
        int valuecount = 0;
        int minLen = 0;
        int curr_Len = 0;
        int curr_left= 0; int curr_right = 0;
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), count++);
            // count++;
        }
        System.out.println(count);


    }
}
