package Questions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);      
     int num=input.nextInt();  
     System.out.println(isPrime(num));
     input.close();
    }
    
    static boolean isPrime(int n){
        // check first number is greater || equal to 1
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            // check if the number is equal to square of c
            if(n%c==0){
                // cjeck the number reminder is equal to zero ot not by divide by the n and c
                return false;
            }
            // loop till n number 
            c++;
        }
        
        return false;
    }
}
