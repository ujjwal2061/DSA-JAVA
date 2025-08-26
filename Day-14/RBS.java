

public class RBS {
 
  static int rbssearch(int [] arr,int target ,int s, int e){
    if(s>e){
        return -1;
    }
    int m=s+(e-s)/2;
    if(arr[m]==target){
    return m;
    }
    if(arr[s]<=arr[m]) // leftside
     {
        if(target>=arr[s] && target<=arr[m]){
            return rbssearch(arr, target, s,m-1);
        }else{
             return rbssearch(arr, target, m+1, e);
        }
    }
    if(target>=arr[m] && target <=arr[e]){
        return rbssearch(arr, target, m+1,e);
    }
    return rbssearch(arr, target, s, m-1);
   } 

    public static void main(String[] args) {
         int [] arr={2,4,6,7,11,33,45};
         int target=100;
         int res=rbssearch(arr, target, 0,arr.length-1);
        System.out.println(res);
        }
}