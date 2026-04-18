// Merge Intervals Problem: 
// Given an array of intervals intervals where intervals[i] = [start, end], 
// merge all overlapping intervals. 
// Example: Input: [[1,3],[2,6],[8,10],[15,18]] 
// Output: [[1,6],[8,10],[15,18]]

import java.util.ArrayList;
import java.util.List;

public class merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6}, {8,10}, {15,18}};
        int currentArr1 = intervals[0][1]; 
        int currentArr0 = intervals[0][0]; 
        List<int[]> list = new ArrayList<>();
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] <= currentArr1){//8<=6?
                currentArr1 = Math.max(currentArr1, intervals[i][1]);//6
            }else{
                list.add(new int[]{currentArr0, currentArr1});
                 currentArr1 = intervals[i][1];//2
                 currentArr0 = intervals[i][0]; //6
            }
        }
        list.add(new int[]{currentArr0, currentArr1});
       for (int i = 0; i < list.size(); i++) {
    int[] interval = list.get(i);
    System.out.println("[" + interval[0] + ", " + interval[1] + "]");
}

       
    }
}
