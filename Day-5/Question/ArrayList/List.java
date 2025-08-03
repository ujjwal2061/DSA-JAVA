import java.util.ArrayList;
import java.util.Scanner;

public class List {
  public static void main(String[] args) {
    // array this is use the take  hug number of the array.
    Scanner input=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> user_arr=new ArrayList<>();
    ArrayList<Integer>arr= new ArrayList<>();
   // take array form the user
    System.out.println("Enter the array ");
    for(int i=0; i<5; i++){
        arr.add(input.nextInt());
    }
    System.out.println(arr);
    // function

    Array_list_2d(user_arr ,input);
       System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : user_arr) {
            System.out.println(row);
        }
    input.close();
  }   
  ///  function with 2D ARRAY list
 static void Array_list_2d(ArrayList<ArrayList<Integer>> nums, Scanner input){
    for(int row=0; row<3; row++){
          ArrayList<Integer> rows = new ArrayList<>();
        for(int col=0; col<3; col++){
           rows.add(input.nextInt());

        }
        nums.add(rows);
    }
    System.out.println(nums);
 }
}
