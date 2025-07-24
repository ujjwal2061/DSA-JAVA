import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
  // making  same cal  with Switch casse 
//    System.out.println("Enter the operation :");

//    char op=input.next().trim().charAt(0);

//    System.out.println("Enter two number :");
//    int num1=input.nextInt();
//    int num2=input.nextInt();

//    int ans=0;
//    switch (op) {
//     case '+':
//         ans=num1+num2;
//         break;
//     case '-':
//         ans=num1-num2;
//         break;
//     case '*':
//         ans=num1*num2;
//         break;  
//     case '/':
//         ans=num1/num2;
//         break; 
//     case '%':
//         ans=num1+num2;
//         break;   
//       default:
//         System.out.println("Invalid operations");
//     }
//     System.out.println(ans);
//    input.close();


   // nested Switch case
   System.out.println("Enter the number: ");
   int empID=input.nextInt();
   
   String department=input.next();
   System.out.println("Enter the Deparemnt: ");
 switch (empID) {
    case 1:
         System.out.println("Ujjwal Gaihrre");
        break;
    case 2:
       System.out.println("Lazy Me");
    break;
    case 3:
      switch (department) {
        case "IT":
              System.out.println("IT guys");
            break;
        case "Sales":{
            System.out.println("Sales guys");
            break;
        }
        default:
            System.out.println("Can't find Deparemnt ");
      }
      break;
    default:
        System.out.println("Only number are allowed");
        break;
 }
  input.close();
}   
}
