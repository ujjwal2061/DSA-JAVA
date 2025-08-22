package LeetcodeQuestionPractice.RandomQuestion;

import java.util.Arrays;

public class SelectionSort {
 static void  slectionSort(int [] arr){
    for(int i=0; i<arr.length-1;i++){
        // Start by assuming the first element of the unsorted part is the smallest”, then check the rest to verify.
        int minIndex=i;
        System.out.println("Current minIndex --> "+minIndex);
        for(int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
        // System.out.println("Current arr[mindex -->]"+arr[minIndex]);
        int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
    }
}
    public static void main(String[] args) {
       int[] arr = {38, 27, 3, 9, 82, 10};
        slectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
 }   
}
