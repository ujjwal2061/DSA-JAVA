

public class Comparison {
    public static void main(String[] args) {
        // comparison of two string 
        String a="ujjwal";
        String b="ujjwal";
        System.out.println(a==b);
        /*
         * Method of Comaporison of String
         1 (==) -->comparator(chek the refercnce variable are point to smae object )

         How to  create the different object  from the same value ?

         -> to make the differnt object of the same value make the new  Object from the new keyboard use
         
         String first=new String("hello");
         String second=new String("hello");
         
         this are outside the string pool but inside the hepa store

         When you need to checj the onlu value use .equal()
        */

        String first=new String("hello");
        String second=new String("hello");
        System.out.println(first==second);
        System.out.println("Using the equal method -->"+first.equals(second));
    
    /*
     Print Format of float number 
     For printing the number of float use the printf(" %.2f") 
     %.2f--> it mean how much last number u want 2 or 3 on base of your use

     */
    float n=4521.4455f;
    System.out.printf("Float number %.3f",n);
    System.out.printf("Pie value %.2f",Math.PI);
    System.out.println(" ");
    // Placeholder
    /*
          The  palcing the string in the as the place to be (Point to be 
          looked the %s and %s take string from how it palce like 
           System.out.printf("Hello my name is %s and I am %s","Ujjwal","Lazy");
           in this the Ujjwal will be  at the firtst palce andLazy will be at second  becuase it palce as it
           id u change the place of the ujjwal and lazy  it print as the change place 
      )
     */
     System.out.printf("Hello my name is %s and I am %s","Ujjwal","Lazy");
    }
}
