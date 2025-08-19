// second day of the Recursion part
public class Recursion2 {
    public static void main(String[] args) {
        //  fun(6);
         int ans=fbao(5);
         int asnsum=sum(5);
         System.out.println(ans);
         System.out.println(asnsum);
        }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n); //-> part from 6-to-1
        fun(n-1);
        System.out.println(n); //-> part from 1-to-6
    }
    static int fbao(int n){
        if(n==1){
            return 1;
        }
        return n*fbao(n-1);
    }
// sum of nums
   static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+fbao(n-1);
    }
}
