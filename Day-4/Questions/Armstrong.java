package Questions;

// import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.print("Enter the number to  find number is Armstrong or not :");
        // int num=input.nextInt();
        for (int i=100; i<1000 ;i++){
            if(check_Armstrong(i)){
                System.out.print(i+ " ");
            }
        }
    //    System.out.println(check_Armstrong(num));
    //     input.close();
    }
    static boolean check_Armstrong(int num){
    int orginal_value=num;
    int sum=0;
    while (num>0) {
     int rem=num%10;
     // get last number from original number 
     num=num/10;
     //  remove the last number 
     sum=sum+rem*rem*rem; // sum of the all number cube
        
    }
    if(sum==orginal_value){
        return true;
    }
    return false;
    }
}
