// Find length of longest consecutive sequence Write a Java program to find the length 
// of the longest consecutive elements sequence from an unsorted array of integers. 
// Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
// The longest consecutive elements sequence is [1, 2, 3, 4, 5], 
// therefore the program will return its length 5.

import java.util.HashSet;

public class consequtive_sequence {
 public static void main(String[] args) {
     int[] arr = {49, 50, 3, 200, 2, 4, 70, 5};
    //  int left = 0; int curr_el = arr[0]; int len = 0;
    HashSet<Integer> set = new HashSet<Integer>();
    int maxCount = 0; int bestStart = 0;
    for(int i = 0; i<arr.length; i++){
      set.add(arr[i]);
    }
    for(int i = 0; i<arr.length; i++){
      if(!set.contains(arr[i]-1)){
        int count=1;
        int current = arr[i];
        while(set.contains(current +1)){ 
          count++;//2
          current = current+1;
        }
        if(maxCount < count){
          maxCount = count;
          bestStart = arr[i];
        }
      }
    }
    System.out.println(maxCount );
    for(int j = 0; j<maxCount; j++){
      System.out.print((j + bestStart) +" ");
    }
 }   
}
