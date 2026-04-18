// Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, otherwise return false.
// An anagram is a word formed by rearranging the letters of another word.

// Example 1:
// Input: s = "anagram", t = "naagram"
// Output: true

package String;

import java.util.HashMap;

public class valid_anagram {
    public static boolean anagram(String s, String t){
        var map = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        for(int p: map.values()){
            if(p != 0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cat";
        String t = "rat";
        System.out.println(anagram(s,t));
    }
}
