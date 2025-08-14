package LeetcodeQuestionPractice;


import java.util.Arrays;

public class RotateArray {
     public static void main(String[] args) {
        // this for single array rotate

    //     int [] arr={1,2,3,4,5,6,7,8,9};
    //     int n=arr.length;
    //     int temp =arr[0];
    //     for (int i=1; i<n; i++){
    //         arr[i-1]=arr[i];
    //     }
    //     arr[n-1]=temp;
    //  System.out.println(Arrays.toString(arr));
    
     int [] arr = {1,2,3,4,5,6,7};
     int n=arr.length;

     int k=3;
     int [] res=kelemtrotate(arr, k ,n);
    System.out.println("K elemmt rotate "+Arrays.toString(res));
    }
    // this for the k elemt of the array 
    // -> with tc 
    static int [] kelemtrotate(int [] arr,int k ,int n){
        k=k%n;
        int [] temp=new int[k]; 
        System.out.println(k);

    for (int i = 0; i <k; i++) {
        temp[i] = arr[i];
        System.out.println("Array of temp"+Arrays.toString(temp));
    }
        for (int i=k; i<n; i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=n-k; i<n;i++){
            arr[i]=temp[j++];
        }
        return arr;
    }
}
