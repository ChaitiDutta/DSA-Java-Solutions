// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

public class buyStock_Sell {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4};
        int min_price = arr[0]; int max_profit = 0; 
        for(int i =1; i<arr.length; i++){
            if(arr[i] - min_price > max_profit){
                max_profit = arr[i] - min_price;
            }else{
                if(arr[i] < min_price){

                    min_price = arr[i];
                }
            }
        }
        System.out.println(max_profit);
    }
}
