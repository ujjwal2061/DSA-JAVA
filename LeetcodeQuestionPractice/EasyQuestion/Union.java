package LeetcodeQuestionPractice.EasyQuestion;

import java.util.Arrays;

public class Union {
    /*
     Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
     */
    /*
     Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}
     */
    public static void main(String[] args) {
         int [] arr1={1,2,3,4,5};
         int [] arr2={2,3,4,4,5};
         int [] res= serchunion(arr1, arr2);
         System.out.println(Arrays.toString(res));
    }
    //\
     static int [] serchunion(int[] arr1,int arr2[]){
        // adding the two array at the with the  create the new  array
       int  [] sumarray=new int [arr1.length+arr2.length];
       return sumarray;
     }
    
}
