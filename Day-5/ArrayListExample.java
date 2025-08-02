import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Integer>  arr = new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(50);
    arr.add(20);
    arr.add(70);
    arr.add(80);
    arr.add(40);
    arr.add(30);
    System.out.println(arr);
    // // check the size  of tht array
    System.out.println(arr.size());
    // // remove the element 
    System.out.println(arr);
    // from the user Input
    System.out.print("Enter the number:");
    for (int i=0;i<5; i++){
      arr.add(input.nextInt());
    }
    for (int i=0; i<5;i++){
      System.out.println(arr.get(i)); // pass the index here arr[i] is not gone wrok here 
    }
    System.out.println("All array list"+arr);
  

    input.close();
  }   
}
