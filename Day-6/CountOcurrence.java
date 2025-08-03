public class CountOcurrence {
    // find the first Occurrence of the give value 
    public static void main(String[] args) {
        int[] input={2,4,4,5,6};
        // find the given ocurrenc in array
        int target=5;
        for(int i=0; i<input.length; i++){
        int cuurent_index=input[i];
        if(cuurent_index==target){
           System.out.println("Got at the index " +i);
           break;
        }
        }

        int i=0;
        while(i<input.length){
         int cuurent_index=input[i];
         if(cuurent_index==target){
            System.out.println("Index at " +i);
            break;
         }
         i++;
        }
    }
}
