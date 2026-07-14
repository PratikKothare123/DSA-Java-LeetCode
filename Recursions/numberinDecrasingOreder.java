package Recursions;

public class numberinDecrasingOreder {
    public static void PrintnumberinDecrasingOreder(int n){
         if(n==1){
            System.out.println(n);
            return;
         }
         System.out.print(n+" ");
         PrintnumberinDecrasingOreder(n-1);
        }
    public static void main(String[] args) {
        PrintnumberinDecrasingOreder(5);
    }
}
