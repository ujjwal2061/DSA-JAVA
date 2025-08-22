package LeetcodeQuestionPractice.EasyQuestion;

public class MergeSort {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
         merge(num1, 3 ,nums2, 3);
    }
    static void merge(int[] nums1,int m, int[] nums2 ,int n){
    int total=m+n-1;
    int first=m-1;
    int second=n-1;

   while(first>=0 && second>=0){
   if(nums1[first]>nums2[second]){
    nums1[total]=nums1[first];
    first--;
    total--;
   }else{
      nums1[total]=nums2[second];
    second--;
    total--;
   }
   }
   while (second>=0) {
     nums1[total]=nums2[second];
     second--;
     total--;
   }
    }
}
