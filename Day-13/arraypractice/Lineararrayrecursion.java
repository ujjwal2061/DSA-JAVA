import java.util.ArrayList;

public class Lineararrayrecursion {
  static boolean findelemtwithrecursion(int[] arr,int target,int index){
     if( index == arr.length){
     return false;
     }
     return arr[index]== target || findelemtwithrecursion(arr, target, index+1);
  }
  // finding the index of array
  static int finIndex(int [] arr,int target,int index){
    if(index==arr.length){
        return -1;
    }
    if(arr[index]==target){
        return index;
    }else{
         return finIndex(arr, target, index+1);
    }
  }
 // findin all array of the target array
 static ArrayList<Integer> list=new ArrayList<>();
 static void findallIndex(int [] arr, int target, int index){
    if(index==arr.length){
        return ;
    }
    if(arr[index]==target){
        list.add(index);
    }else{
     finIndex(arr, target, index+1);
    }
 }
    public static void main(String[] args) {
     int[] arr={1,5,6,7,88,88 ,5};
     int target=88;
     System.out.println(findelemtwithrecursion(arr, target, 0));
     System.out.println(finIndex(arr, target, 0));
     findallIndex(arr, target, 0);
    System.out.println(list);
 }    

}
