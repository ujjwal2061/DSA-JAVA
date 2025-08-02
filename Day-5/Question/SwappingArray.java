package Question;

import java.util.Arrays;

public class SwappingArray {
 public static void main(String[] args) {
    int[] arr ={1,3,5,7,9};
    // function of the swapping array
    swap(arr ,0,4);
    System.out.println("Swapping value"+Arrays.toString(arr));
 }   
 static  void swap(int[] arr, int index1 ,int index2){
 int temp=arr[index1];
 arr[index1]=arr[index2];
 arr[index2]=temp;
 }
 // do with user input the same question
}
