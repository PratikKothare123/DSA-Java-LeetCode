import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {
        // int i = 1, j = 1;
        // for (i = 1; i < 6; i++) {
        // for (j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }
        // // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // int i = 1, j = 1;
        // for (i=1;i<=5; i++) {
        // for (j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // print Half-Pyramid Pattern
        // int i = 1, j = 1;
        // int n = 5;
        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= i; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println();
        // }
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // int i = 1, j = 1;
        // char ch='A';
        // int n = 4;
        // for (i = 1; i <= n; i++) {
        //     for (j = 1; j <= i; j++) {
                
        //         System.out.print( ch);
        //         ch  ++;
        //     }
        //     System.out.println();
        // }


        class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
    
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}



    }
}
