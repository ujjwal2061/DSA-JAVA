import java.util.Arrays;
// merger sorting with the recursion  function   
public class Mergesort {
static int [] mergesort(int[] arr){
    if(arr.length==1){
        return arr;
    }
    // divide  the array two part;
    int mid=arr.length/2;
    int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid)); 
    int [] right =mergesort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left,right);
}
static  int [] merge(int[] first,int[] second){
    int [] mix=new int [first.length+second.length];
    int i=0;
    int j=0;
    int k=0;
    while (i<first.length & j<second.length) {
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        }else{
            mix[k]=second[j];
            j++;
        }
        k++;
    }
    // what if one arrya did not complete while rruning  mergeing process
    // add the rraming array at end
       while(i<first.length){
        mix[k]=first[i];
        i++;
        k++;
    }
    while(j<second.length){
        mix[k]=second[j];
        j++;
        k++;
    }
    return mix;
}
    public static void main(String[] args) {
    
        int[] arr={5,4,3,5,6,2,1};
        int [] arr1={5,4,3,2,1};
        arr=mergesort(arr1);
        int[] ans=mergesort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
   }
 

}
