import java.util.Arrays;

public class non_overlapping_intervals {
    public static void main(String[] args) {
         int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
         Arrays.sort(intervals,(a,b) -> a[1]-b[1]);
        //  int currInt0 = intervals[0][0];
         int currInt1 = intervals[0][1];
         int count = 0;
         for(int i = 1; i<intervals.length; i++){
            if(currInt1 > intervals[i][0]){
                count++;
            }else{
                // currInt0 = intervals[i][0];
                currInt1 = intervals[i][1];
            }
         }
         System.out.println(count);
    }
}
