
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        // two 2d Array 
        // array of the array
          /*[
             [11,42,53,64]
             [11,26,38,96]
             [11,22,33,44]
             ] */
      // Question-1 first take input from the user 2D.
      Scanner user_input=new Scanner(System.in);
       int[][] arr=new int [3][3];
       int [][] user_arr=new int [3][3];
       user_2D_function(user_arr ,user_input);
     

    //   System.out.print("Enter the 3*3 number for 2d array:");
      // input the array section
      for( int row=0; row<arr.length;row++){
        System.out.println("Row -->"+row);
        for( int col=0; col<arr[row].length;col++){
            // input here
            arr[row][col]=user_input.nextInt();
        }
    }

    // // output
      for( int row=0; row<arr.length;row++){
        for( int col=0; col<arr[row].length;col++){
            System.out.print(" "+arr[row][col]+" ");
        }
        System.out.println();
     }
      
    }
    // from the function 
    static void user_2D_function(int[][] arr ,Scanner user_input){
         // first take input 
         for(int r=0; r<arr.length; r++){
            for(int c=0;c<arr[r].length;c++){
            arr[r][c]=user_input.nextInt();
            }
         }
         // output
          for(int r=0; r<arr.length; r++){
            for(int c=0;c<arr[r].length;c++){
            System.out.print(" "+ arr[r][c] +"");
            }
        System.out.println();
        }
    
    }
}
