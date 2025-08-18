package LeetcodeQuestionPractice.EasyQuestion;
import java.util.Arrays;

public class RunningSum {
     public static void main(String[] args) {
         // leetcode questions:1480 Ruuning sum of 1d Array
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
         int [] arr={1,2,3,4}; 
         int []res= runningSum(arr);
         System.out.println(Arrays.toString(res)); 
    }
     static int[] runningSum(int[] nums) {
        // for loop index one bata start vaxa  in kina index[0] is sum of itself vaya ra !
        for(int i=1;i<nums.length ;i++){
            System.out.println("Current index ko  value ho yo fari "+nums[i]);
            int sub_index=nums[i-1];        
            System.out.println("Yo index lai subtraction gara ko ho nai ki value lai :"+sub_index);
            nums[i]=nums[i]+sub_index; 
        }
        return nums;
        
    }
    }
