

public class Recursion {
public static void main(String[] args) {
     // Baics of the recursion functon 
     // message();
     // write a function that takes in number and prints it 
     // print first five number 
     printnumber(1);
}
static void message(){
     System.out.println("Hello wordl");
       // call message1
     message1();
}    
static void message1(){
     System.out.println("Hello wordl");
       // call message2
     message2();
}  
static void message2(){
     System.out.println("Hello wordl");
      // call message3
     message3();
}  
static void message3(){
     System.out.println("Hello wordl");
     // call message4
     message4();
}  
static void message4(){
     System.out.println("Hello wordl");
}  
// number is Recursion
static  void printnumber(int n){
     System.out.println(n);
     printnumber2(2);
}
static  void printnumber2(int n){
     System.out.println(n);
     printnumber3(3);
}
static  void printnumber3(int n){
     System.out.println(n);
     printnumber4(4);
}
static  void printnumber4(int n){
     System.out.println(n);
     printnumbe5(5);
}
static  void printnumbe5(int n){
     System.out.println(n);
}

}
