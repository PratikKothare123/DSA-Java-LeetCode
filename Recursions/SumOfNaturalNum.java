
package Recursions;
public class SumOfNaturalNum{
    
    public static int SumOfN(int n){
        if(n==1){
            return 1;
        }

        int sum = n + SumOfN(n-1);
        return sum ;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum: "+SumOfN(n));
    }
}