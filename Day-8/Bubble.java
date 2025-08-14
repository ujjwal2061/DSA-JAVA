import java.util.Arrays;

public  class Bubble {
public static void main(String[] args) {
     int [] arr={5,4,3,2,1};
      bubblesort(arr);
      System.out.println(Arrays.toString(arr));
}
static void bubblesort(int arr[]){
     // if the array is already swaped then no need to check for the arr[1] or other
     boolean swaped;
     for(int i=0; i<arr.length;i++){
        swaped=false;
        // inner loop for ecah max item will come at last index
        for(int j=1; j<arr.length-i;j++){
            // sawp the value  is smaller then previous value 
            if(arr[j]<arr[j-1]){
               int temp= arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               swaped=true;
            }
        }
        if(!swaped){
            break;
        }
   }
 }
}
