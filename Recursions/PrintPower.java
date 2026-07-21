package Recursions;

public class PrintPower {
    public static int powerCal(int x,int n){
        if(n==0){
            return 1;
        }

        return x * powerCal(x,n-1);
    }

    public static int optimizrPower(int x,int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimizrPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        // System.out.println(powerCal(x,n));
        System.out.println(optimizrPower(x,n));
    }   
}
