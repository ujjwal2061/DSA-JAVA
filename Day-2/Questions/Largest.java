import java.util.Scanner;

public class Largest {
    // finfin the Largest number 
     public static void main(String[] args) {
        System.out.println("Enter 3 number: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
      
        //
      int maxNumberIs=a;
      if( b> maxNumberIs){
        maxNumberIs=b;
      }
      if(c >maxNumberIs){
          maxNumberIs=c;
      }
      System.out.println("MaxNumber is:" +maxNumberIs);
     }
     
}
