import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in) ;
      System.out.println("Enter number to find fib number ");
      int num=input.nextInt();
      int perviso_number=0;
      int current_number=1;
      int count=2;
      //
      while(count <=num){
          int temp_value=current_number;
          current_number=current_number+perviso_number;
          perviso_number=temp_value;
          count++;
        }
        System.out.println("Fibo number is :"+current_number);
        input.close();

    }
}