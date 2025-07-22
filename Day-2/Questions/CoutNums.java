public class CoutNums {
     public static void main(String[] args) {
        int n=213343;
        int count=0;
        while(n >0){
            int  reminder=n%10;
            System.out.println(reminder); 
            if( reminder==3){
                count++;
            }
            n=n/10;
            System.out.println(n);
        }
        System.out.println("The number is "+count);
     }
}
