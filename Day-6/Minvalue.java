public class Minvalue {
 public static void main(String[] args) {
    int[] arr ={18,12,7,3,14,28};
  System.out.println(min_value(arr));
 }   
 static int min_value(int []arr){
  int min_ans=arr[0];
  for(int index=1; index<arr.length;index++){
    int current_vlaue=arr[index];
    // less then current vlaue 
    if(current_vlaue < min_ans){
      min_ans=current_vlaue;
    }
  }
  return min_ans;
 }
}
