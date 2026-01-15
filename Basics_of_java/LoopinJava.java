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

        // Scanner sc = new Scanner(System.in);

        // do{
        // System.out.print("Enter a Number: ");
        // int num = sc.nextInt();
        // if(num%10==0){
        // continue;
        // }
        // System.out.println("Your No was: "+num);
        // }while(true);

        // check a Number is A prime Or Not

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A number: ");
        // int n = sc.nextInt();

        // int i=2;
        // boolean isPrime = false;
        // for(i=2;i<(n-1);i++){
        // if(n%i==0){
        // isPrime=true;
        // }

        // }
        // if(isPrime==false){
        // System.out.println(n+" is prime Number");
        // }else{
        // System.out.println("Not Prime Number");
        // }


        // Print Even And Odd Sum Without using Array of n numbers

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A Value Of N: ");
        // int n = sc.nextInt();
        // int evensum = 0;
        // int oddsum = 0;
        // for (int i = 0; i < n; i++) {
        //     // System.out.println("Enter number: ");
        //     int ele = sc.nextInt();
        //     if (ele % 2 == 0) {
        //         evensum += ele;
        //     } else {
        //         oddsum += ele;
        //     }

        // }

        // System.out.println(evensum + " " + oddsum);

        // fizz-buzz interview DSA Question
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of N: ");
        int n = sc.nextInt();
        int ctr3 =0,ctr5=0;
        for(int i=1;i<=n;i++){
            ctr3++;ctr5++;
            if(ctr3 != 3 && ctr5 != 5){
                System.out.println(i + " ");
            }
            else if(ctr3 == 3){
                System.out.println("Fizz");
                ctr3 =0;
            }
            if(ctr5 ==5){
                System.out.println("Buzz");
                ctr5=0;
            }
        }

    }
}
