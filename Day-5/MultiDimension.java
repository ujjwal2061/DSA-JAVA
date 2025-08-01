import java.util.Scanner;

public class MultiDimension{
    // 2d array 
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         
        /*
          1 2 3
          4 5 6
          */

          // syntax 
           // data_type [][] variable_name= new data_type [number of rows][number of coloums]
        //   int [][] arr =new int[3][];
          
        //   int [] [] arr1 ={
        //       {1,2,3},
        //       {4,5,6},
        //       {8,9,0}
        //   };
        
        //  for(int i=0; i< arr1.length; i++){
        //     //   System.out.println("This row" + i + " ");
        //       for ( int j=0; j<arr1[i].length; j++){
        //     //     //   System.out.print("Thsis col :"+ j+" ");
        //            System.out.print(arr1[i][j] + " ");
        //       }

        //   }
          // input in the 2d arrary 
          int [][] arr=new int [3][3];
          System.out.println("Enter 2D arrary");
         for( int r=0; r<arr.length;r++){
            for(int col=0; col<arr[r].length; col++){
                arr[r][col]=input.nextInt();
            }
        }
       // output fo the 2D arrary
             for( int r=0; r<arr.length;r++){
            for(int col=0; col<arr[r].length; col++){
                System.out.print(" "+arr[r][col] + "");
            }
            System.out.println();
        }
   input.close();
    }

}
