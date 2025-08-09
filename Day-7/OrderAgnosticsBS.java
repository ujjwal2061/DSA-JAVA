

public class OrderAgnosticsBS {
   public static void main(String[] args) {
      int []arr ={-18,-12,-4,0,2,3,4,15,16,18,24,32};
     int tragte=18;
     int ans=orderAgnosticsbd(arr, tragte);
     System.out.println(ans);
   }
   
   
   //
    static int orderAgnosticsbd(int[] arr ,int target){
        int s=0;
        int e=arr.length-1;
        // Find the array is asceding or not oder
         boolean isAsc=arr[s]<arr[e];

        //  if(arr[s]<arr[e]){
        //     isAsc=true;
        //  }else{
        //     isAsc=false;
        //  }

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(isAsc){
            if(target<arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }
            // if arr is not asceding order 
            }else{
                if(target>arr[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }

        }
        return -1;
    }
}
