import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class distinct_max_sum_of_subarray {
   public static void main(String[] args) {
        int[] num = {0};
        int maxLen = 0;
        int left = 0; 
        var mapValue = new HashMap<Integer, Integer>();
        
        for (int i = 0; i< num.length; i++){
            if(num.length <2){
                maxLen =1;
            }
            mapValue.put(num[i], mapValue.getOrDefault(num[i],0 )+ 1); //
            if(mapValue.size() >2){
                mapValue.put(num[left], mapValue.get(num[left])-1);
                if(mapValue.get(num[left]) == 0){
                    mapValue.remove(num[left]);
                }
                left++;
            }
            if(mapValue.size() == 2){
                maxLen = Math.max(maxLen, i-left+1);
            }
        }
        System.out.println(maxLen);

    }
}
