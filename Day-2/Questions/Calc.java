import java.util.Scanner;

public class Calc {
 public static void main(String[] args) {
    // cal
    Scanner input=new Scanner(System.in);  
    
    int ans=0;
    while(true){
        System.out.println("Enter operator (+, -, *, /): ");
        char op=input.next().trim().charAt(0);
        // main if  entry point
        if(op== '+' ||  op=='-' || op== '*'|| op=='/'||op=='%'){
            System.out.println("ENTER THE TWo NUMBER ");
            // two number from the User  
          int num1=input.nextInt();
          int num2=input.nextInt();
          if(op=='+'){
              ans=num1+num2;
            }
            if(op=='-'){
              ans=num1-num2;
            }
            if(op=='*'){
              ans=num1*num2;
            }
            if(op=='/'){
                if(num2 != 0){
                    ans=num1/num2;
                }
            }
            if(op=='%'){
                 ans=num1%num2;
            }
            }else if (op=='x' || op=='X'){
                break;
            }else{
                System.out.println("Invaild operation");
            }
            System.out.println(ans);
            }
            input.close();
        }
    }

