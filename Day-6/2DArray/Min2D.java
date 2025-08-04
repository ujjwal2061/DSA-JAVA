import java.util.Arrays;

public class Min2D {
    public static void main(String[] args) {
        int [][] arr={
            {22,33,44,55},
            {66,24,55,12,60},
            {34,76,88,10},
        };

        int[] ans=search_2d_arr(arr);
        System.out.println(Arrays.toString(ans));

    }
    // return type is array so
    static int [] search_2d_arr(int [][] num){
        int min_2d=num[0][0];
           for(int row=0; row<num.length;row++){
            for( int col=0; col<num[row].length;col++){
                int current_2d_index=num[row][col];
                if(current_2d_index<min_2d)
               return  new int []{row ,col};
            }
           }
            return  new int []{-1 ,-1};
    }
}
