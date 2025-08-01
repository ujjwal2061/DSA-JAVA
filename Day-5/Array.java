import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Array of the Pritmive 

        // syntax of array ;
        // data_types[] variable_name=new datatypes[size];
        // int[] rolls=new int[5];

        // System.out.println("Single array list"+rolls);
        // // directy wya of array 

        // int [] rolls2={23,33,44,55};
        // System.out.println(rolls2[3]);

        // String[] word=new String[3];
        // String[] words={"Ujjwal","Kishan"};
        // System.out.println(word[0]);
        // System.out.println(words[1]);

     // simple printhe  list of the array by use input 
    //  System.out.println("Enter the number to print it");
    //  int  n=input.nextInt();
    //  int[] arr = new int [n];
    //  for (int i=0; i<n; i++){
    //     // System.out.println("Before  value of arr[] is :"+arr[i]);
    //     // System.out.println("Before index  i value :"+i);
    //     arr[i]=i; 
    //     // System.out.println("After index i value  :"+i);
    //     // System.out.println("After arr[]value is  "+arr[i]);
    // }
    // // so the out put of the array in the [String foramt]
    // System.out.println("Number of the array is :"+Arrays.toString(arr));
 
    
    // Array of the Object 
    String [] str=new String[4];
    for (int i=0; i<str.length; i++){
        str[i]=input.next();
    }
    System.out.println(str[3]);
    System.out.println(Arrays.toString(str));
    
    input.close();
}
}
