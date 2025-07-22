public class RevNums {
     public static void main(String[] args) {
        int init=124567;
        int resnumb=0;
   while(init >0){
    int rem=init%10;
    init=init/10;
    resnumb=resnumb*10+rem;
   }
   System.out.println("The Revers number is "+resnumb);
     }
}
