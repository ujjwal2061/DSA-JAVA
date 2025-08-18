public class BS {
    // recursionin Binary Search
    public static void main(String[] args) {
        int [] arr={1,2,3,45,52,64,74,80};
        int target=74;
        int res= binaryserch_recursion(arr ,target, 0, arr.length-1);
        System.out.println(res);
    }
    static int binaryserch_recursion(int [] arr ,int  target,int s, int e){
        // start is greater then end
        if(s>e){
        return -1;
    }
     int m=s+(e-s)/2;
if(arr[m]==target){
    return m;
}
if(target<arr[m]){
     return binaryserch_recursion(arr, target, s, m-1);
}
return binaryserch_recursion(arr, target, m+1, e);
    }
}
