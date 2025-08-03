package Question;
import java.util.Arrays;


public class ReversArray {
 public static void main(String[] args) {
    int[] arr ={1,3,23,9,18,56,44};
    // function of the swapping array
     resver_arr(arr);
    System.out.println("Resver arr "+ Arrays.toString(arr));
 }   
 static  void resver_arr(int[] arr){
    int start=0;
    int end=arr.length-1;
    while (start <end){
        swap(arr, start, end);
        start++;
        end--;
    }
 }
  static  void swap(int[] arr, int index1 ,int index2){
 int temp=arr[index1];
 arr[index1]=arr[index2];
 arr[index2]=temp;
 // one more question ok 
}
}