package Question;

public class MaxArray {
    public static void main(String[] args) {
        int [] arr={22,33,100,11,66};
        int [] arr1={22 ,33,44,55,11,1,2,36,7,88,90};
        int res= find_Max_element(arr);
        int res1= max_range_value(arr1, 2,7);
        System.out.println("Max value is "+res);
        System.out.println("Range value is "+res1);
    }
    static int find_Max_element(int[] arr){
        int max_value=arr[0];
        for( int i=1; i<arr.length; i++){
            int current_value=arr[i];
            // System.out.println("Current value is :"+current_value);
            if(current_value>max_value ){
                max_value=current_value;
            }
        }
        return max_value;
    }
    // fint the max_value in range value
    static int max_range_value(int[]arr, int s ,int e){
        int max_range=arr[s];
        for (int i=s; i<=e; i++){
            int  current_range=arr[i];
            if(current_range>max_range){
                max_range=current_range;
            }
        }
        return max_range;
    }
}
