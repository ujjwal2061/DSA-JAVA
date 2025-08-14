package LeetcodeQuestionPractice;

public class PresnetArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int target=9;
        int res=searcharray_index(arr ,target);
        System.out.println(res);
    }
    static int searcharray_index(int [] arr, int target){
        for(int  i=0; i<arr.length; i++){
        if(arr[i]==target){
           return  i;
        }
    }
    return -1;
}
}
