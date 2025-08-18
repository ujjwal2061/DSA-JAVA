 package LeetcodeQuestionPractice.EasyQuestion;

class RemoveDuplicate {
public static void main(String[] args) {
 // -> leetCode question 26
 /*
 Input: arr[1,1,2,2,2,3,3]
Output: arr[1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] 
and Therefore return 3 after assigning [1,2,3] in the beginning of the array. */
int[] arr={1,1,2,2,2,3,3};
int k=removeduplicate(arr);
for(int i=0; i<k-1;i++){
    System.out.println(arr[i]);
}
System.out.println(k);
}
 static  int removeduplicate(int[] arr){
    int i=0;
    // set the initalk value i=0;
    for(int j=1; j<arr.length; j++){
        // loop through the index index[1];
        if(arr[i]!=arr[j]){
            // check if the index arr[i] is not equal to index of arr[j]
            arr[i]=arr[j]; // if not then set the value arr[i] to arr[j] 
            // yo van ko arr[j] ko value k xa current time to value lai arr[i] ma set gara  ho
            i++; // then increase the i++ once arr[i] not equal to arr[j]
        }
    }
    // last index of the array
    return i+1;
 } 

} 