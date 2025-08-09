

public class Binary {
   public static void main(String[] args) {
     int []arr ={-18,-12,-4,0,2,3,4,15,16,18,24,32};
     int tragte=18;
     int ans=binarysearch(arr, tragte);
     System.out.println(ans);
   }
   // return index  
   // return -1 if not exits ;
   static int binarysearch(int[] arr ,int tragte){
   int start_index=0;
   int end_index=arr.length-1;
   System.out.println("End index is :"+end_index);
    while(start_index<=end_index){
         // find the middle elemt 
         int mid_elemt=start_index+(end_index-start_index)/2;
         System.out.println("Mid value :"+mid_elemt);
         if(tragte < arr[mid_elemt]){
           // serching in the left side becuase the middle value is greter then less value 
            end_index=mid_elemt-1;
         }else if(tragte>arr[mid_elemt]){
         start_index=mid_elemt+1;
        } else{
            return mid_elemt;
        }
    }
    return -1;
   }

}
