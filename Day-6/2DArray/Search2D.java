import java.util.Arrays;

public class Search2D {
     public static void main(String[] args) {
        // initalize the array 2D
        int [][] arr=
        {
            {1,2,3,4},
            {12 ,34 ,56,77,},
            {33,66,88,99,100},
        };
       int target=100;
       // -->  store the arr in new array
       int [] ans=  search_2D(arr,target);
       
       System.out.println(Arrays.toString(ans));
     }
     // -->function
     static int[] search_2D(int [][] arr ,int target ){
        for(int row=0; row<arr.length;row++){
            for( int col=0; col<arr[row].length;col++){
                int current_index_array=arr[row][col];
                if(current_index_array==target){
                 return new int []{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }
}
  