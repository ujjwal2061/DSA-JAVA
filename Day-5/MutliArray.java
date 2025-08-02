import java.util.ArrayList;
import java.util.Scanner;

public class MutliArray {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> nums=new ArrayList<>();
    // nums is null now ;
    // initilaisation the array
    for (int i=0; i<3; i++){
   nums.add(new ArrayList<>());
   }
   System.out.print("Enter the 9 number :");
  // add the elemnts
  for (int row=0; row<3; row++){
    for ( int col=0; col<3;col++){
      nums.get(row).add(input.nextInt());
    }
  }
  System.out.println(nums);
input.close();
}    
}
