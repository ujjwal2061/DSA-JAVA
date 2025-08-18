package LeetcodeQuestionPractice.EasyQuestion;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr={22,33,11,44,6,89};
        int [] res=Secondsmallest_number(arr);
        System.out.println(Arrays.toString(res));

    }
    
// 
static int [] Secondsmallest_number(int [] arr){
    if(arr.length <2){
        return new int []  {-1 ,-1};
    }
    int  smallest ,second_smallest;
    int largest ,second_larget;
    // check the first that arr[0] and arr[1] check the number ok 
    // find which one is greater and smallest .
    if(arr[0]<arr[1]){
        smallest=arr[0]; // arr[1] one is bigger then arr[0] so it arr[0] is smallest 
        second_smallest=arr[1]; // it is bigger theen arr[0] so it second value
        largest=arr[1];
        second_larget=arr[0];
    }else{
        smallest=arr[1]; // resver there
        second_smallest=arr[0];
        largest=arr[0];
        second_larget=arr[1];
    }
    for(int i=2; i<arr.length; i++){
        if(arr[i]<smallest){
            second_smallest=smallest;
            smallest=arr[i];
        }else if(arr[i]>smallest && arr[i]<second_smallest){
            second_smallest=arr[i];
        }
         if(arr[i]>largest){
            second_larget=largest;
            largest=arr[i];
        }else if(arr[i]<largest && arr[i]>second_larget){
            second_larget=arr[i];
        }
    }
    return   new int [] {second_smallest,second_larget};
}
}