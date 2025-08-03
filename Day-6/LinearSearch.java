

public class LinearSearch {
    public static void main(String[] args) {
        // linear Search
        int[] arr={23,34,44,55,66,99};
        int  target_value=99;
        int res=linear_search(arr, target_value);
        System.out.println("Find it  target value at index "+res);
    }
    // search in the array :return the index if find found
    // otherwise if item not found retrun-1
    static int linear_search(int[] arr ,int target_value){
        // check the array is less then zero or not 
    if (arr.length==0) {
        return -1;
    }
    // run the loop
    for (int index=0;index<arr.length;index++){
    //check for elemts in every index
    int elemts=arr[index];
    if(elemts==target_value){
        return index;
    }
   }
   // this line will execute if none of the return statemenst above exceute 
   // that mean target not found
  return -1;
 }
}
