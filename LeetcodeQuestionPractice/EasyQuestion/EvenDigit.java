package LeetcodeQuestionPractice.EasyQuestion;

class EvenDigit {
     // Eeven Digit number 
    public static void main(String[] args) {
          int[] nums={12,345,2,6,7896};
          int ans=findNumbers(nums);
          System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count=0;
         for(int num:nums){
            if(check_number_even(num)){
                count++;
            }
         }
        return count;
    }
    // check number is even or not 
     static boolean check_number_even(int num){
        int numberofdigits=digit(num);
        if(numberofdigits %2==0){
         return true;
        }
        return false;

     }
     // count number  of dights in number
     static int digit(int num){
        if(num < 0){
            num=num*-1;
        }
        if(num ==0){
            return 1;
        }
        int count=0;
        while (num>0) {
             count++;
             num=num/10;
        }
        return count;
}
}