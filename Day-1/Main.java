import java.util.Scanner;

public class Main{
   
 public static void main(String[] args){
    System.out.println("Hello world");
   // input the variable 
    Scanner  text=new Scanner(System.in);
    int number=text.nextInt();
    // showing to user as output 
    System.out.println("Number is "+number);
    text.close();

 }
}