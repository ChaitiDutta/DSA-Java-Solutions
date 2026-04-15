// Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, otherwise return false.
// An anagram is a word formed by rearranging the letters of another word.

// Example 1:
// Input: s = "anagram", t = "naagram"
// Output: true

package String;

public class valid_anagram {
    public static boolean anagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i< s.length(); i++){

        }

        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s,t));
    }
}
