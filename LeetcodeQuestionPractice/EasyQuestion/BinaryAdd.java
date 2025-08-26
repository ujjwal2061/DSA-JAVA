 package LeetcodeQuestionPractice.EasyQuestion;

class BinaryAdd {
 public static void main(String[] args) {
     System.out.println(addBinary("1010", "1011"));
 }
  static String addBinary(String a, String b){
    int st1=a.length()-1; // last index of the String 
    int st2=b.length()-1; // last index of the String
    int carry=0; // current carray is Zero;
    StringBuilder res=new StringBuilder();
   while (st1>=0 || st2>=0 ) {
    // why ?it convert the string to int 
    int n1=(st1>=0) ? a.charAt(st1--)-'0' :0;
    int n2=(st2>=0) ? b.charAt(st2--)-'0' :0;
     int sum=n1+n2+carry;
     System.out.println("n1 value -->"+n1);
     System.out.println("n2 value -->"+n2);
     System.out.println("Sum of the  n1+n2 -->"+sum);
     // adding the remdiner on the res 
     res.append(sum%2);
     System.out.println("Afer the append  remdiner-->"+res);
     // add the 
     carry=sum/2;
     System.out.println("Last carray "+carry);
   }
   if(carry==1) res.append(1);
 return res.reverse().toString();
}
}