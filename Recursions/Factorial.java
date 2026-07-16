package Recursions;

public class Factorial {
    
    public static int factorial(int num){
        
        if(num==0){
            return 1;
        }

        // int fnm1 = factorial(num - 1);
        int fn = num * factorial(num-1);
        return fn ;
       
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+n+": "+factorial(n));
    }
    
}
