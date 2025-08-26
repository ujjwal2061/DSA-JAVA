import java.util.ArrayList;

public class ArraylistRecursion {
   // array list find the target list in [index ,index]
   static ArrayList<Integer> arraylistrecursion(int [] arr ,int target, int index ,ArrayList<Integer> list){
   if(index==arr.length){
    return list;
   }
   if(arr[index]==target){
    list.add(index);
   }
    return arraylistrecursion(arr, target, index+1,list);
   }
    public static void main(String[] args) {
     int[] arr={12,33,44,55,12,49,69,12};
     int target=12;
     ArrayList<Integer> ans=arraylistrecursion(arr, target,0,new ArrayList<>());
    System.out.println(ans);
  }  
}
