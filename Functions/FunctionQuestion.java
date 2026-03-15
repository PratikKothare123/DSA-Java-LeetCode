package Functions;
import java.util.*;

public class FunctionQuestion {

    public static int ProductAB(int x,int y){
        int p = x*y;
        return p;
    }

    public static int Factorial(int a){
        int fact = 1;
        for (int i=1;i<=a;i++){
            fact = fact *i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial(n-r);
        int binarryCoff = n_fact/ (r_fact * nmr_fact);
        return binarryCoff;
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ener A value of N: ");
        // int n = sc.nextInt();
        // System.out.println("Ener A value f R: ");
        // int r = sc.nextInt();
        // int result = binCoeff(n,r);
        // System.out.println("Binarry Coefficient ="+result);  // Binarry Coefficient =10
        
        
        // int result = Factorial(n);
        // System.out.println(result);

        // int a= 3;
        // int b=5;
        // int result =ProductAB(a,b);
        // System.out.println(result);

        //Check Weather A number is prime or not
        // System.out.println(isPrime(11));


        // primeInRange(20);

    }
}
