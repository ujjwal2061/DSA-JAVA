public class MainRecursion {
 public static void main(String[] args) {
    printnumber(1);
 }   
 static void printnumber(int n){
    // this for the function where 
    // it check that number is 5 then break the function 
    if(n==5){
        System.out.println(5);
        return;
    }
    System.out.println(n);
    // recursion call 
    // tail rescursion
    printnumber(n+1);
 }
 
}
