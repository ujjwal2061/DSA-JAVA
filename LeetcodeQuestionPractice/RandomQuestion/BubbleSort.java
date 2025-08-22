package LeetcodeQuestionPractice.RandomQuestion;

import java.util.Arrays;

public class BubbleSort {
    static void bubblesort(int [] arr){
        boolean swapped;
        for(int i=0; i<arr.length-1;i++){
            swapped=false;
            // if fu say why we do this 
            // j<arr.length-1-i
            // If j went up to n, then arr[j+1] would go out of bounds.
            //  so we stop at n-1. here 
            // now for -i why after the every i pass the bigger elemt set to last index 
            // bubble sort do in such way by create the pass for ecah outer loop index  
            for(int j=0 ;j<arr.length-1-i;j++){
                // in this we comapre the current arr[j] index value to arr[j+1] next to
                // curent value if it current is  bigger then the arr[j+1] it swap
                // 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
       int[] arr = {38, 27, 3, 9, 82, 10};
            bubblesort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
