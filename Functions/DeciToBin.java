package Functions;

import java.util.*;
public class DeciToBin {
    public static void DecimalToBinary(int n){
        int binary = 0;
        int pow=0;
         int num = n;
        while (n>0) {
       
        int rem = n%2;
        binary= binary +( rem * (int)Math.pow(10,pow));
        pow++;
         n = n/2;
        }
        System.out.println("Decimal of "+num + " = " + binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Value: ");
        int n = sc.nextInt();
        DecimalToBinary(n);

    }
}
