import java.util.Arrays;

public class SlectionSort {
public static void main(String[] args) {
    int [] arr={4,5,3,1,2};
    int[] res=slectionsortarray(arr);
    System.out.println(Arrays.toString(res));
}
    static int [] slectionsortarray(int [] arr){
        for(int i=0; i<arr.length; i++){
            // finding the  max items in the remaing array and swap with corect index
            int lastindex=arr.length-i-1;
         geetingmaxIndex(arr ,0 ,lastindex);
        }
        return  arr;
    }
    private static int geetingmaxIndex(int [] arr ,int s ,int e){
         int max=s;
         for(int i=s; i<e;i++){
            if(arr[max]==arr[i]){
            max=i;
            }
         }
         return max;
    }
}