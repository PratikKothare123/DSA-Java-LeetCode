import java.util.Scanner;

public class LoopinJava {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter How Many times You Want To Print Statement: ");
        // int num = sc.nextInt();
        // int count = 0;
        // while(count<num){
        // System.out.println("Pratik Kothare!");
        // count++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter How Many you Want to Print: ");
        // int count = sc.nextInt();
        // int num=1;
        // while(num<=count){
        // System.out.println(num);
        // num++;
        // }

        // Dition of first n natural number

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The Number: ");
        // int num = sc.nextInt();
        // int sum=0;
        // int count=1;
        // while(count<=num){
        // sum = sum+count;
        // count++;
        // }
        // System.out.println("Addition Of All number Is: "+sum);

        // For loop

        // int i=1;
        // for(i=1;i<=10;i++){
        // System.out.println("Hello Pratik");
        // }

        // Print Star Pattern

        // int i=0;
        // int j=0;
        // for(i=0;i<=3;i++){
        // for(j=0;j<=3;j++){
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }
        // // * * * *
        // //* * * *
        // //* * * *
        // //* * * *

        // Print Reverce Of A number

        // int n=10899;
        // int reverce;
        // while(n>0){
        // reverce = n%10;
        // n=n/10;
        // System.out.print(" "+reverce);
        // }

        // Reverce The Given Number

        // int result=0;
        // int reverce;
        // int n = 34567;
        // while(n>0){
        // reverce = (n%10);
        // result = (result*10)+reverce;
        // n=n/10;
        // }
        // System.out.println("Reverce No is: "+result);

        // Do While Loop
        // int count=1;
        // do{
        // System.out.println("Pratik");
        // count++;
        // } while(count<=10);

        // Break statement

        // int i;
        // for(i=0;i<5;i++){
        // if(i==3){
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("Im out of the loop!");

        // Scanner sc = new Scanner(System.in);

        // do{
        // System.out.print("Enter A number:");
        // int n = sc.nextInt();
        // if(n%10==0){
        // break;
        // }
        // }while(true);

        // continue

        // int i=1;
        // for(i=1;i<=5;i++){
        // if(i==3){
        // continue;
        // }
        // System.out.println(i);
        // }

        // Display all numbers entered by user expect multiples of 10

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Your No was: "+num);
        }while(true);

    }
}
