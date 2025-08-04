package LeetcodeQuestionPractice;

public class Wealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
       System.out.println( maximumWealth(accounts));
        
    }
     static int maximumWealth(int[][] accounts) {
        // person=row
        // acount =col;
        int ans=Integer.MIN_VALUE;
        for (int person=0; person<accounts.length; person ++){
             int sum=0;
             for (int account=0; account<accounts[person].length;account++){
               sum+=accounts[person][account];
             }
             // out of  it  
             // check with  overall ans
             if(sum> ans){
                ans=sum;
             }
            }
            return ans;
    }
    
}
