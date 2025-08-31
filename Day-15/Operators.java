// Operators in String 

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // CharAt
         System.out.println('a'+'b');  // --> 195 why  ?
         // ans it convert to ASCII vlaue of char wwhich a-->997 and b---> 98 so it 195
         
         // String 
         /* 
          String did not convert to ASCII value
          what will happend if add the String and number 
          Array List with String
         */
         System.out.println("a"+"b");
         System.out.println("a"+3);
         System.out.println("Hello" +new ArrayList<>());
         // can't do in java
        //  System.out.println("a"-"b");
        /*
          This take to much memory and did not use the perrviso series 
          it adding to the new serise "a" now "ab" at last "ab..z" till end it make ab ,abc ,abcd ,abcde like this 
         */
         String series="";
         for (int i=0; i<26; i++){
            char ch=(char)('a'+i);
            series=series+ch;
         }
         System.out.println(series);
         // Sulation of it 
         /*
          Create data type that add to orginal series not create the series O(n) 
          use the StringBuilder st=new StringBulider();
          it did not crate the new Object in every append loop
          */
        StringBuilder builder=new StringBuilder();
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
