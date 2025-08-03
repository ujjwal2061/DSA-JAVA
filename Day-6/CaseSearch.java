public class CaseSearch {
    public static void main(String[] args) {
        String words="HelloWorld";
        char target ='H';

        for(int i=0; i<words.length(); i++){
            char current_word_index=words.charAt(i);
            // cinverting the both char to lowercase so it can easy to check 
            if(Character.toLowerCase(current_word_index)==Character.toLowerCase(target)){
                System.out.println("Found index at  by for loop " +i);
            break;
            }
        }
       
         // by while loop
         int i=0;
         while (i<words.length()) {
             char current_word_index=words.charAt(i);
             if(Character.toLowerCase(current_word_index)==Character.toLowerCase(target)){
                System.out.println("By the While loop " +i);
                break;
             }
             i++;
         }
    }
}
