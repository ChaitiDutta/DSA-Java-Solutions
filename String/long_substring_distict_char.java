// Given a string s, find the length of the longest substring without duplicate characters.
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
package String;

import java.util.HashMap;

public class long_substring_distict_char {
    public static void main(String[] args) {
        var map = new HashMap<Character, Integer>();
        int maxLen = 0; int left = 0;
        String s = "abcabcbb";
        for(int i = 0; i<s.length(); i++){
             map.put(s.charAt(i), i);
            if(map.containsKey(s.charAt(i))){   
                left = Math.max(left, i+1 );    //0,          
            }
             maxLen = Math.max(maxLen, i - left + 1);
        }
    }
}
