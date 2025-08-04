package Searching_index;
public class SearchRange {
    public static void main(String[] args) {
         int[] arr={22,33,44,11,55};
         int t=11;
         System.out.println(serach_range(arr, t, 0,1));
    }
    // search in Range (
    static boolean serach_range(int[] arr ,int t, int s,int e){
        for (int index=s; index<e;  index++){
            int current_t=arr[index];
            if(current_t==t){
                System.out.println(index);
                return true;
            }
        }
     return false;
    }
}
