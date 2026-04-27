// Container With Most Water
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
public class leetcode_11 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int left =0; int right = arr.length -1; int maxArea = 0;
        int curr_area = 0;
        while(left<right){
            int length = Math.min(arr[left], arr[right]); //8,7 =7
            curr_area = length * (right -left); //7 * 7 = 8
            if(arr[left] < arr[right]){
                left++; //8
            } else{
                right --;
            }
            maxArea = Math.max(maxArea, curr_area); //0,8=8
        }
        System.out.println(maxArea);
    }
}
