import java.util.ArrayList;

public class MatchIndex {
    public static void main(String[] args) {
        // find the all index wher it match target 
        int [] arr={3,4,5,3,3,6};
        int target=3;
        ArrayList<Integer> list=new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            int cuurent_index=arr[index];
            if(cuurent_index==target){
                   list.add(index);
            }
        }
        System.out.println("Array list "+list);
    }
}
