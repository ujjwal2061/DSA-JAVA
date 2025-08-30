
// String class
public class Stringdata {
    public static void main(String[] args) {
     // basic of  String
    String name ="hello world";
    String b="hello world";
    
    // name and b where ponit to same object at string pool.
    System.out.println(name);;
    System.out.println("Before the change -->"+b);

    // String are imumtability in java can't change it once u create it .
    // why the String are immumtability beacuse of  security 

     b="ujjwal"; 
     /*  this is not change for the above b it create the new Object that point to the 
      --->"ujjwal"
      can't change in the String object by  refrence
      */
      System.out.println("After the change of --> "+b);
      System.out.println(name);

    /*   the question came what will hapoend the  first variable that pont to the "hello world" after new b is create
         and point to the "ujjwal"
        --> simple  Garbage collection 
        */
    
    /*
     Why can modify the string in objects
     Ans--> Example there is 5 person with same name (string pool heap memory)
     and First person A new string object is created, and only that reference changes.
     The other references remain untouched.
     that mean one that only changes have to first pesron name
     */
    
    }
}
