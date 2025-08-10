package LeetcodeQuestionPractice;



public class RoateArray {
  public static void main(String[] args) {
    int [ ] arr ={3,4,5,1,2}; 
    System.out.println(check(arr));
 
  }   
  // 
  static boolean check(int [] arr){
   int count=0; int nums=arr.length;
   for(int i=0; i<nums; i++){
        System.out.println(arr[i+1]%nums);
        System.out.println(arr[i]);
        if(arr[i] > arr[(i+1)%nums]){
               System.out.println("Before the Roate" + nums);
               System.out.println("Before the Roate" + count);
            count++;
            System.out.println("After the Roate" + count);
                    System.out.println("Afrer the Roate" + nums);
            // System.out.println("After  the Roate"+);
        } 
        if(count >1){
            return false;
        }
    }  
    return true;
}
}
