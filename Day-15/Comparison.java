

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
    }
}
