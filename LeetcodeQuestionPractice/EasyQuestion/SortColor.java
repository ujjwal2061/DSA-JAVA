package LeetcodeQuestionPractice.EasyQuestion;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
       int [] nums={2,0,1};
        int  [] res=sortcolor(nums);
        System.out.println(Arrays.toString(res));
    }
     static  int [] sortcolor(int[] nums){
     for(int i=0; i<nums.length; i++){
        int  minIndex=i; 
// ->assume that every current loop index is minIndex
        for(int j=i+1; j<nums.length;j++){
            if(nums[j]<nums[minIndex]){
                minIndex=j;
            }
        }
        if(minIndex!=i){
            int temp=nums[i];
            nums[i]=nums[minIndex];
            System.out.println(nums[minIndex]);
            nums[minIndex]=temp;
        }
     }
     return nums;
     }
}
