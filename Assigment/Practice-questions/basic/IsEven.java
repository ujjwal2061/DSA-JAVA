import java.util.Scanner;

public class IsEven {
 public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     // 1. Write a program to print whether a number is even or odd, also take input from the user.
    //   System.out.print("Enter the number to find is Even or Odd :");
    //    int num=input.nextInt();
    //    isEven(num);
     // Take name as input and print a greeting message for that particular name.
      System.out.print("Enter your name --> ");
      String name=input.nextLine();
      greeting(name);
     // 3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
     
     System.out.print("Enter P--> ");
     int p=input.nextInt();
     System.out.print("Enter R--> ");
     int t=input.nextInt();
     System.out.print("Enter T --> ");
     int r=input.nextInt();

      System.out.println("Simple Interest --> "+SP(p, t, r));
      input.close();
 }    
 // function for the evene or odd
 static void isEven(int n){
    if(n==0){
        System.out.println("Even number");
    }
    if(n%2==0){
        System.out.println("Number is even ---> "+n);
    }else{
        System.out.println("Number is odd ---> "+n);
    }
 }
 // greating user
 static void greeting( String name){
       System.out.println("Hello welcome "+name.toUpperCase());
 }
 // Simple interst 
  static int SP(int p,int t,int r){
    if(p==0 || t==0 || r==0 ){
        return -1;
    }
    int SI=p*t*r /100;
  return SI;  
}
}
