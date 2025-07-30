import java.util.Scanner;

public class Function {
     public static void main(String[] args) {
       // hello(); // -> calling the function
       //   int ans=sum2();
       //   System.out.println(ans);
         String message=greet();
         System.out.println(message);
         int ans1=add(20,30);
         System.out.println(ans1);
         String personalized_message=Mygreeting("Ujjwaal gaihre");
         System.out.println(personalized_message);
         System.out.print("Enter your  name: ");
         Scanner text=new Scanner(System.in);
         String name=text.nextLine();
         String mesg=Mygreeting1(name);
         System.out.println(mesg);
         text.close();
     }
     // define the function

      // interger  function
     static int sum2(){
      Scanner in=new Scanner(System.in);
       System.out.print("Enter the Number :");
       int num1=in.nextInt();
      System.out.print("Enter the Number 2 :");
       int num2=in.nextInt();
       int sum=num1+num2;
       in.close();
       return sum; // -return type is intger 
     }
     // strring function
     static String greet(){
      String greeting="how are you man ?";
      return  greeting;
     }
   // arguments in function 
   // passing the valuewhen function is calling in main fucntion
   static int add(int a,int b){
      int sum=a+b;
      return sum;
   }
   // argumenst as String
   static String Mygreeting( String name){
      String message="Hello "+name +" what up";
      return message;
   }
   // from user inputs;
 static String Mygreeting1( String name){
      String message="Hello "+name +" what up";
      return message;
   }
   //   static  void hello(){
   //      System.out.println("Hello World thsi void function retrun nothing ");
   //   }
}
