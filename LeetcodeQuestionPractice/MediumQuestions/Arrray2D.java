package LeetcodeQuestionPractice.MediumQuestions;

class Arrray2D {
  // serach in 2d by covert to 1d array 
  static  boolean search_2Darray(int [][]arr,int target){
    System.out.println("High of the arr--->" +arr[0].length); // print the number of coloums in first row
    System.out.println("Low-->"+  arr.length); // print the number of the rows
    int low=arr[0].length; // first elemt of the array;
    int high=arr.length;; // last emlemt of the array ; 
     // explain of the this part
     /*
      low van ko 2d array ko first array[index] ko lenght ho .
      ra high  vanko  (count the 2d array length)
     
     */
    int s=0;
    int e=high*low-1; // find the end points of the array
    while(s<=e){
        int m=s+(e-s)/2;
        int row=m/low;  // geeting the index row of the array from the 2d array
        int col=m%low; // column of the index that row 
        int value=arr[row][col];
        if(value==target) return true;
        if(value < target) s=m+1;
        else e=m-1;
    }
    return false;
  }
 
    public static void main(String[] args) {
     int[][] arr={
     {1,2,3,4,5}, ///  --->  5 cols
     {10,22,33,44}, /// --->  4 cols
     {4,6,8,9,10}}; /// ---> 5 cols 
     int target=33;
     System.out.println(search_2Darray(arr, target));
 }
    
}