public class PalindromString {
    public static void main(String[] args) {
        // checking word is plaindromString using the Bulider method
        String w="abcdcba";
        StringBuilder words=new StringBuilder();
        words.append(w);
        words.reverse();
        if(words.toString().equals(w)){
            System.out.println("yes");
        }else {
            System.out.println("No, not a palindrome.");
        }
     
        System.out.println( isPalindrome(w));
    }
    // divided the into two 
 static boolean isPalindrome(String str){
    if( str==null || str.length()==0){
        return true;
    }
    str=str.toLowerCase();
    for(int i=0; i<=str.length()/2;i++){
        char start=str.charAt(i);
        char end=str.charAt(str.length()-1-i);

  if(start!=end){
    return false;
  }
    }
 return true;
 }
}
