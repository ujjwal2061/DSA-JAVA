package LeetcodeQuestionPractice.EasyQuestion;

import java.util.Arrays;
 // this not optmial approach have to  refactore later when learning about hasing
public class TwoSum {
   public static void main(String[] args) {
     int [] arr={2,7,11,15};
     int target=9;
     int[] res=twoSum(arr, target);
     System.out.println(Arrays.toString(res));
   }
   static int[] twoSum(int[] nums, int target) {
 for(int i=0; i<nums.length;i++){
    for(int j=i+1; j<nums.length;j++){
        if(nums[i]+nums[j]==target){
             return new int [] {i,j};
        }
    }
 }  
 return new int[]{};
}
}
