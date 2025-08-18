package LeetcodeQuestionPractice.EasyQuestion;
import java.util.ArrayList;
import java.util.Arrays;


/*
Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */
public class MoveZero {
    public static void main(String[] args) {
      int[] nums={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
    //   int[] res=moveZeros(nums);   
    // System.out.println(Arrays.toString(res));
     int[] res1=optimalSoluation(nums);
     System.out.println(Arrays.toString(res1));
    }
    // bruter soulation
    static  int [] moveZeros(int [] nums){
         ArrayList<Integer>  temp=new ArrayList<>();
         for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
         }
         for(int i=0; i<temp.size();i++){
            nums[i]=temp.get(i);
         }
         for(int i=temp.size(); i<nums.length;i++){
            nums[i]=0;
         }
     return  nums;
        }
        // optimal Soulation
    static int [] optimalSoluation(int [] nums){
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
             break;
            }
        }
        if( j==-1) return nums;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                 swapnumber(nums ,i ,j);
                j++;
            }
        }
        return nums;
    }
    static  void swapnumber(int [] arr ,int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
}
