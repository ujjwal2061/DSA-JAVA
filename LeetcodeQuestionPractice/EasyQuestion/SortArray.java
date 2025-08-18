package LeetcodeQuestionPractice.EasyQuestion;

import java.util.Arrays;

// LeetCode =912
// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
public class SortArray {
     public static void main(String[] args) {
        int [] nums={5,2,3,1};
        int  [] res=sortingarray(nums);
        System.out.println(Arrays.toString(res));
     }
     //  slection sorting
     static int [] sortingarray(int[] nums){
         for(int i=0; i<nums.length;i++){
            // assume that the currrent index is min
            int  minIndex=i;
            // start from the minIndex and go  end array 
             for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            
            if(minIndex!=i){
                int temp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }
           }
           return nums;
        }
     }

