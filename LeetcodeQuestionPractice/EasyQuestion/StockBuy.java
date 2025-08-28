package LeetcodeQuestionPractice.EasyQuestion;


 /// Question Slove of Leetcode eeasy 
 /// Stock Buy and Sell
 /// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and 
// sell on day 5 (price = 6), profit = 6-1 = 5.
public class StockBuy {
    // Brute Force Approach -->time bigo(n*2)  -->space Big O(1);
    // Linear Questions
    static int buyandsell( int [] arr){
    int max=0;
    for(int i=0; i<arr.length;i++){
    for(int j=i+1; j<arr.length; j++){
        if(arr[j]>arr[i]){
          int   diff=arr[j]-arr[i];
          max=Math.max(max,diff);
         }
         
    }
  }
  return max;
    }
    // Optimal soulation
    static int stockbuy(int [] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length ;i++){
            // comapre the price of [i] with minPrice
            // if price  is thenn then minPrice then store  the price[i] to minPrices
            if(prices[i]<minPrice){
                minPrice=prices[i];
                // System.out.println("Ater compare "+minPrice);
            }else if(prices[i]-minPrice >maxProfit){
                maxProfit=prices[i]-minPrice;
            }
            }
            return maxProfit;
        }

public static void main(String[] args) {
   int [] arr={7,1,5,3,6,4} ;
   int res=buyandsell(arr);
   int res1=stockbuy(arr);
   System.out.println(res);
   System.out.println(res1);
}
}