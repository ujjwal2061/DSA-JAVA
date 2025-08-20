package LeetcodeQuestionPractice.EasyQuestion;

public class SteptoZeros {
    public static void main(String[] args) {
        // leetcode questions 1342 Number of Steps to Reduces a Number to Zero
   int nums=14;
     int res=numberofSteps(nums);
     System.out.println(res);
    }
    static int numberofSteps(int num){
      return helper(num,0);
    }
    static int helper(int nums,int steps){
        if(nums==0){
            return steps;
        }
        if(nums%2==0){
            return helper(nums/2, steps+1);
        }
        return helper(nums-1, steps+1);
    }
}
