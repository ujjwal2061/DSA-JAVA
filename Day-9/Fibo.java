public class Fibo {
    public static void main(String[] args) {
        // fibo of the nth number using the recusrion 
  System.out.println(fibo(8));
    }
    static int fibo(int n){
        //base  condition
        // less then 2 
        if(n<2){
            return n;
        }
        return fibo(n-1)+n-2;
    }
}
