package LeetcodeQuestionPractice.RandomQuestion;
 // need to revist looked ok 
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={35,7,9,8,10,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }
     static int ans(int [] arr ,int target){
        // finding the range
        // first start with a box of size 2 [1,2,3,4,5,6,7,...n] to this->[1,2]
     int start=0; //index[0]
     int end=1;   //index[1]
     // target is  lagerthen arr[end] then double it 
     while (target > arr[end]) {
        int temp=end+1;
        // doblue of box value
        // end =previous end +sizofbox*2
        end=end+(end-start)*2;
        start=temp; // temp value 
     }
     return search(arr, target, start, end);
     }
      static int search(int[] nums, int target ,int start ,int end){
         while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
         }
         return -1;
     }
}
