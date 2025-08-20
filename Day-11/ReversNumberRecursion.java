

public class ReversNumberRecursion {
    // simple way-1
     static int sum=0;
  static void  firstone(int n){
  if(n==0){
    return ;
  }
  int rem=n%10;
  sum=sum*10+rem;
  firstone(n/10);
  }
  // another way // did not understand fully have to looked again
  static int rev2(int n){
    int digits=(int)(Math.log10(n))+1;
    return helper(n ,digits);
  }
  static int helper(int n,int digits){
    if(n%10==n){
     return n;
    }
    int rem=n%10;
 return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
  }
  public static void main(String[] args) {
     int n=12345;
     firstone(n);
      System.out.println(sum);
      System.out.println("Second way "+rev2(n));
  } 
 
}
