import java.util.ArrayList;

// arraylsit without passing the arrgument  on the  function 
public class ArraylistRecursionwithoutArrgument {
     static ArrayList<Integer> arraylistrecursionwithoutArrgument(int [] arr ,int target, int index ){
   ArrayList<Integer> list= new ArrayList<>();
         if(index==arr.length){
    return list;
   }
   //   only have the answer on the function call at this not pass to future fucntion call 
   if(arr[index]==target){
    list.add(index);
   }
   ArrayList<Integer> ansFormFuturecall= arraylistrecursionwithoutArrgument(arr, target, index+1);
   // this fucntion remove when the stack it about to remove it.
  list.addAll(ansFormFuturecall);
  return list;   
}
   public static void main(String[] args) {
     int[] arr={12,33,44,55,12,49,69,12};
     int target=12;
    ArrayList<Integer> ans=arraylistrecursionwithoutArrgument(arr, target, 0);   
    System.out.println(ans);
} 
}
