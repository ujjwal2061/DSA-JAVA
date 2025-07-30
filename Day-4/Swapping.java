public class Swapping {
    public static void main(String[] args) {
         int a=20;
         int b=30;
       
        //swapping
        //  int temp=a;
        //  a=b;
        //  b=temp;

      /*
         Swapping with  function but not gone wrok why ? 
         beacuse ther wher pass by the value and they where not changed in the orginal value 
         so it will not work 

        */
         swap(a, b);
         System.out.println(a+" "+b);
         String name="Kiran";
         System.out.println("After the Function :"+name);
          System.out.println("Try to change "+SwappingString(name));

         /* 
          a-->10
           num1-->10
          b-->20
          num2-->20  

          */
    }
     static void swap(int a,int b){
         int temp=a;
         a=b;
         b=temp;
    }
    // string changed ?
    static String SwappingString(String naam){
      naam="Ujjwal";
      System.out.println("Inisde the Fucntion "+naam);
     return naam;
    }

}
