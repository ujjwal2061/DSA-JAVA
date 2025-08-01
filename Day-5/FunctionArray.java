
import java.util.Arrays;

public class FunctionArray {
  public static void main(String[] args) {
    
    int[] nums={3,4,5,6};
    String[] words={"Ujjwal","Hello","Heheh"};
    passing_String(words);
 
    System.out.println("Orginal value"+Arrays.toString(nums));
    arrFunction(nums);
    System.out.println("Change value "+Arrays.toString(nums));
  } 
  //passing the array in the function 
  static void arrFunction(int[] arr){
    System.out.println("Befor the change"+arr[0]);
   arr[0]=99;
   System.out.println("After the change "+arr[0]);
  }  
  // passing the String to the function
  static void  passing_String(String[] str){
    System.out.println("Geting String from the  function"+Arrays.toString(str));
  }

}
