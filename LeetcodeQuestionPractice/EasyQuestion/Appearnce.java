package LeetcodeQuestionPractice.RandomQuestion;

public class Appearnce {
    public static void main(String[] args) {
// Leet code Wasy Question is this 
// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
//  Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.
   int [] arr={2,2,2,3,3,1};
   int res=findSingleappreance(arr);
   System.out.println(res);
    }
    static int findSingleappreance(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            int num=arr[i];
         for(int j=1 ; j<arr.length;j++){
            // yo condtions ma maila check gara xu ki  if  arr[j] mean   inner loop ko current index if e=== arr[i]
            // first take ar[i] first index then again check to arr if it came double time 
            // if  then count ++
            if(arr[j]==num){
                count=arr[j];
            }
            if(count==1){
                return  num;
            }
         }
        }
        return -1;
    }
    
}
