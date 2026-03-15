package Functions;
import java.util.*;
public class BasicFunctions {

    public static void printHello(){
        System.out.println("My Name is Pratik");
    }

    public static int calculateSum(int n1,int n2){ //parameter or Formal parameter
        int  sum = n1 + n2;
        return sum;
    }
    public static void main(String[] args) {
        // printHello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters 
        System.out.println("Sum Of a and b = " + sum);
    }
}
