// Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

// **Example:**
// Input: [1,2,3,1]
// Output: true
//set.add(1)-> this returns true or false;
import java.util.HashSet;

public class containDuplicate {
    public static boolean duplicateValue(int[] num){
        if(num.length == 0){
            return false;
        }
        HashSet<Integer> setValue = new HashSet<Integer>();

        for(int i = 0; i<num.length; i++){
            if(!setValue.add(num[i])){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[] num = {1,2,3,1};
        System.out.println(duplicateValue(num));
    }
}
