package LeetcodeQuestionPractice;

public class ResverInt {
    public static void main(String[] args) {
        int num=1534236469;
        int res=0;
         Reserv_number(num, res);
    }
    // function 
    static boolean Reserv_number(int num ,int res){
        while (num !=0) {
            int d=num%10;
            System.out.println("%-->" + d);
            res=res*10+d;
            System.out.println("Res-->"+res);
            num=num/10;
            System.out.println("last num-->"+num);
        }
      return true;
    }
}
