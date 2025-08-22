package LeetcodeQuestionPractice.RandomQuestion;

import java.util.Arrays;

public class MergePractice {
    // main array function just split the array in the two part 
    // unit the array reach to the single array elemnt 
   static int [] practicemergeSort(int[] arr){
     int m=arr.length/2;
     //base case to check the arr is less one or not 
     if(arr.length==1){
        return arr;
     }
     
     int[] leftsidearray=Arrays.copyOfRange(arr, 0,m);
     int[] rightsidearray=Arrays.copyOfRange(arr, m,arr.length);

     leftsidearray=practicemergeSort(leftsidearray);
     rightsidearray=practicemergeSort(rightsidearray);
    // now merger the array that came from the sort part 
    return mergearray(leftsidearray,rightsidearray);
   }
   static int [] mergearray(int [] leftSide,int [] righside){
   // create new array to store the  meger array
    int [] mergearray=new int [leftSide.length+righside.length] ;
    // ths is for the leftSide array index
    int i=0;
     // ths is for the RightSide array index
    int j=0;
     // ths is for the mergeArray array index
    int k=0;
    while (i<leftSide.length && j<righside.length) {
       if(leftSide[i]<righside[j]){
        mergearray[k]=leftSide[i];
        i++;
        k++;
    }else{
        mergearray[k]=righside[j];
        j++;
        k++;
    }
}
    // now the problme is that when any array did not complete what u will do 
    // it mean that where there less then elemnt at one array like 3 index in the leftside 
    // but at the right side still 3 elemt is remaing what to do?
    //-> at the add all  elemnt to  merger array at  last index
    while (i<leftSide.length) {
         mergearray[k]=leftSide[i];
         i++;
         k++;
    }
       while (j<righside.length) {
         mergearray[k]=righside[j];
         j++;
         k++;
    }
    return mergearray;
   }
    public static void main(String[] args) {
    int [] arr={38,27,3,9,82,10};
    // System.out.println(practicemergeSort(Arrays.toString(arr)));
    
    int [] res=practicemergeSort(arr);
    System.out.println("Result -> "+Arrays.toString(res));
 }  

}
 // beacuse we where split the array in ecah recursion call till  n which take [log n]
 // then  when  it merger it take O(n)  two arrays  of size to the n number of array so 
// time -> O(n* log n)
// space -> O(n)
// -> Arrays.copyOfRange() creates new arrays at each recursion.