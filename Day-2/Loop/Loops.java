
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         The loop is a method that helps you perform
         a certain task multiple times.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to print here: ");

        int num = input.nextInt();
        // Question 1: Print number from 1 to n with for loop
        for(int i=1 ; i<num;i++){
            System.out.println(i);
        }
        // Question 2: Print numbers from 1 to n
        // while loop
        int i = 1;
        while (i <=num) {
            System.out.println(i);
            i++;
        }

         /* when to use while and for loop
           -> use the for loop  where u know how many time the loop run
           -> use the while loop when u don't know how many time loop run
           for example run the loop till use press  some number or keybord
          */

        /*  do{
        // body
            }while()
         */
         int n=1;
         do{
             System.out.println("hello world");
         }while ( n !=1);


    }
}
