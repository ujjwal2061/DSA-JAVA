// Method in String 

import java.util.Arrays;

public class MethodString {
    public static void main(String[] args) {
    
     String name = "Hello word";
     System.out.println("Upper case --> "+name.toUpperCase());
     System.out.println("Lower case --> "+name.toLowerCase());
     System.out.println("Original string --> "+name);
     System.out.println("Array of  string -->"+Arrays.toString(name.toCharArray()));
     System.out.println("Get the index of String -->"+name.indexOf('e'));
     System.out.println("Split strirng to array -->"+Arrays.toString(name.split(" ")));
    }
}
