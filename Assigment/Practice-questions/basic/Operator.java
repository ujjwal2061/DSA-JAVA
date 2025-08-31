import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the two number ---> ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        System.out.println("Enter th operator % ,*,+,-");
        char word=input.next().charAt(0);
      System.out.println( operator(n1, n2, word));
   input.close();
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    }
    static int operator(int num1  , int num2 ,char op){
        int ans=0;
        if( op == '+' || op=='*' || op=='%' || op=='-'){
         if( op=='+'){
            ans=num1+num2;
         }
            if( op=='-'){
            ans=num1-num2;
         }
            if( op=='*'){
            ans=num1*num2;
         }
            if( op=='+'){
            ans=num1+num2;
         }
            if( op=='%'){
                if(num2<num1){
                    return -1;
                }else{
                    ans=num1+num2;
                }
         }
        }
    return ans;
 }
}
