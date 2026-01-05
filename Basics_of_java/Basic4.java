import java.util.*;

public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Type Casting In java

        // float n1 = 23.45f;
        // int n2 = (int)n1;
        // System.out.println(n2);

        // Type Pramotions In Expressions (onlu in expressions)

        char a = 'a';
        char b = 'b';
        // System.out.println((int) a); // 97
        // System.out.println((int) b); // 98

        // System.out.println(b-a); //1
        // System.out.println(a); //a

        // Type Promotion in Expressions
        // 1. Java automatically promotes each byte, short, or char operand to int
        // when evaluating an expression.


        // 2. If one operand is long, float, or double, the whole expression
        // is promoted to long, float, or double respectively.

        // int n1 = 20;
        // float n2 = 12.4f;
        // long n3  = 40;
        // double n4 = 100;
        // double sum = n1 + n2 + n3 + n4;
        // System.out.println(sum);    //172.4000015258789


    }
}
