public class StringSearch {
    public static void main(String[] args) {
        String name="Ujjwal";
        char target='o';
     System.out.println(serach_string(name, target));
    }
    static boolean serach_string(String name,char target){
        if(name.length()== 0){
           return false;
        }
         for(int i=0; i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
         }
         return false;
    }

}
