// Find length of longest consecutive sequence Write a Java program to find the length 
// of the longest consecutive elements sequence from an unsorted array of integers. 
// Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
// The longest consecutive elements sequence is [1, 2, 3, 4, 5], 
// therefore the program will return its length 5.
public class consequtive_sequence {
 public static void main(String[] args) {
     int[] arr = {49, 50, 3, 200, 2, 4, 70, 5};
     int left = 0; int curr_el = arr[0]; int len = 0;
    for(int i = 1; i<arr.length; i++){
        if(arr[i] == curr_el+1){ // 50 == 50? yes // 3 == 51? No
            arr[left] = curr_el; // arr[0] = 49
            curr_el = arr[i]; // curr_el = 50;
            left++; // 1
            len++;
        }else{

        }
    }
 }   
}
