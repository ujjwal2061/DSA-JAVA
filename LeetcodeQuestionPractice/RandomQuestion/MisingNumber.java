package LeetcodeQuestionPractice.RandomQuestion;

public class MisingNumber {
//     Example 1:
// Input Format: N = 5, array[] = {1,2,4,5}
// Result: 3
// Explanation: In the given array, number 3 is missing. So, 3 is the answer.
public static void main(String[] args) {
    int N=5;
    int[] arr={1,2,3,4};
    int res=missingnumber(arr ,N);
    int res1=betterapporach(arr, N);
    System.out.println(res1);
    System.out.println(res);
    
}
 // yo N number dako xa to number sama loop run gara ra check  gra ni ki 
 // to number ko bich ma kun nai nnumber missing xa  kina array ma 
 // tai vaya ra two loop use vako 
static int missingnumber(int [] arr,int N ){
    for(int i=1; i<=N;i++){
        int isPresnet=0;
        for(int j=0; j<arr.length;j++){
            if(arr[j]==i){
           isPresnet=1;
           break;
            }
        }
        if(isPresnet==0){
            return i;
        }
    }
    return -1;
}
// beeter algo
 // time comp-> o(n) , space comp->o(1)
static int betterapporach(int[] arr,int N){
    int sum1=N*(N+1)/2;
    int sum=0;
    for(int i=0;i<arr.length; i++){
        sum=sum+arr[i];
    }
    return sum1-sum;
}
}