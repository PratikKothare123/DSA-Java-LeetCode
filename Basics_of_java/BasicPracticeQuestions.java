
import java.util.*;

public class BasicPracticeQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question1:In a program,input 3 numbers :A,BandC.You have to output the
        // average of 3 numbers

        // System.out.print("Enter N1:");
        // int n1 = sc.nextInt();

        // System.out.print("Enter N2:");
        // int n2 = sc.nextInt();

        // System.out.print("Enter N3:");
        // int n3 = sc.nextInt();
        // float avg = (n1 + n2 + n3) / 3;
        // System.out.println("Average:" + avg);

        // Question 2:
        // In a program, input the side of a square.
        // You have to output the area of the square.
        // (Hint: area of a square = side * side)


        System.out.print("Enter the Side of Square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area Of Square is:" + area);

    }
}
