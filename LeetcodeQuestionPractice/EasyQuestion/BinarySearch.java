package LeetcodeQuestionPractice.EasyQuestion;

public class BinarySearch {
    // leetcode 704
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target=2;
        int ans=search(nums, target);
        System.out.println("Ans" +ans);
    }
      static int search(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
         while(s<=e){
            int mid=s+(e-s)/2;
            if(target<nums[mid]){
                e=mid-1;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                return mid;
            }
         }
         return -1;
     }
}
