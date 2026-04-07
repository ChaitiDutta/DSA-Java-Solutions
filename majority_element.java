// Majority Element
// Given an array nums of size n, return the majority element.

// The majority element appears more than n/2 times.
// Example:
// Input: [3,2,3]
// Output: 3
public class majority_element {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int count =0; 
int curr_El = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(count==0){
                curr_El = arr[i];//1
                count = 1;
            }else{
              if(arr[i] == curr_El ){ // 3 == 1?    No. THEN ENTER else
                    count++; //2
                }else{
                    count--; //1
                }
            }
        }
    //     count=0;
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] == curr_El){
    //             count++;
    //         }
    //     }
    // if(count > arr.length/2){
    // }
    System.out.println(curr_El);
    }
}
