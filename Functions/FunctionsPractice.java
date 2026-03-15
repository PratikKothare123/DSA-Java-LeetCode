package Functions;
import java.util.*;
public class FunctionsPractice {

    public static boolean isEven(int n){
        boolean isEven = true;
        if( n %2 !=0){
            isEven = false;
        }else{
            isEven = true;
        }
        return isEven;
    }
    public static void AvgOfThree(int n1, int n2, int n3){
        int avg = (n1+n2+n3)/3;
        System.out.println("Average of 3 Number= "+avg);
    }


    public static int sumDigit(int n){
        int sum =0;
        while (n!=0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isPalindrom(int n){
        int result=0;
        int num=n;
        boolean isPalindrom = true;
        while(n!=0){
            result = result * 10 + (n % 10);
            n = n/10;
        }
        if(num!=result){
            isPalindrom = false;
        }else{
            isPalindrom = true;
        }
        return isPalindrom;

    }
    public static void main(String[] args) {
        //Q-1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N1: ");
        // int n1 = sc.nextInt();
        // System.out.println("Enter N2: ");
        // int n2 = sc.nextInt();
        // System.out.println("Enter N3: ");
        // int n3 = sc.nextInt();
        // AvgOfThree(n1,n2,n3);


        //Q-2
        // boolean ans = isEven(9);
        // if(ans ==true){
        //     System.out.println("No is even");
        // }else{
        //     System.out.println("No is Odd");
        // }
        
        //Q-3
        // System.out.println("Enter A Number: ");
        // int n = sc.nextInt();
        // boolean ans = isPalindrom(n);
        // if(ans==true){
        //     System.out.println(n + " Is Palindrom");
        // }else{
        //     System.out.println("Not a Pllindrom");
        // }

        //Q-5
        //Write a Java method to compute the sum of the digits in an integer
         System.out.println("Enter A Number: ");
        int n = sc.nextInt();
        System.out.println("sum of " + n + " is= "+ sumDigit(n));
       

    }
}