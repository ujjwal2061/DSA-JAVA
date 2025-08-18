package LeetcodeQuestionPractice.MediumQuestions;

import java.util.Arrays;

public class FirstandLast {

    public static void main(String[] args) {
         int [] nums = {5,7,7,8,8,10}; 
        int target = 8;
          int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {
       int  [] ans ={-1 ,-1};
       int start=search(nums ,target,true);
       int end=search(nums, target,false);
       ans[0]=start;
       ans[1]=end;
       return ans;
    }
   static int search (int [] nums,int target ,boolean firstindex){
    int ans=-1;
    int start=0;
    int end=nums.length-1;
    while (start<=end) {
        int mid=start+(end-start)/2;
        if(target<nums[mid]){
           end = mid - 1;
        }else if(target>nums[mid]){
            start = mid + 1;  
        }else{
            ans=mid; 
            // yo part ma hami la ans find gararu tra tai pani hami serch gara xau left side tira ki ajai earil index xa kin target value index vanra  
            if(firstindex){
                end=mid-1;
            }else{
                // yo fari right side tira serch tira xa 
                start=mid+1;
            }
        }
    }
  return ans;
}
}