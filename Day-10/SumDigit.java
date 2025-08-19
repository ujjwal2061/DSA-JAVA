public class SumDigit {
    public static void main(String[] args) {
         int res=sumdigit(1234);
         System.out.println(res);
    }
    static int sumdigit(int n){
        if(n==0){
            return n;
        }
         // easy for understand
    //     int r=n%10;
    //     n=n/10;
    //  return r+ sumdigit(n);
    return (n%10) +sumdigit(n/10);
    }
}
