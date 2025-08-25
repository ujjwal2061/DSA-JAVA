

public class Checkearray {
    // Cheching the Array is sotred or not with recurison
     static boolean  sorted(int[] arr, int index){
        // base condtionds for the Index out of bound
        if(index==arr.length-1){
            return true;
        }
        // return false or true
        // check the  current index is < to [current Index+1] -> next one  
        return arr[index] < arr[index+1] && sorted(arr, index+1); 
     }
    public static void main(String[] args) {
        int [] arr={1,2,4,5,7,8,9};
        System.out.println(sorted(arr, 0));
    }
}
