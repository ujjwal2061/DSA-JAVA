package LeetcodeQuestionPractice.EasyQuestion;
// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
// Examples:
// Input: prices = {1, 1, 0, 1, 1, 1}

// not good for Time  complexity take 3ms  fucked up 
public class ConsecutiveCount {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int res=countvlaue(nums);
   System.out.println(res);
    }
    static int countvlaue(int [] nums){
        int cnt=0;
        int max_count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                max_count=Math.max(max_count, cnt);
            }else{
                cnt=0;
            }
        }
        return max_count;
    }
}
