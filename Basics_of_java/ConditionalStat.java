import java.util.Scanner;

public class ConditionalStat {
    public static void main(String[] args) {
        // int age = 16;
        // if(age>19){
        // System.out.println("You Can Voe , Drive");
        // }
        // if(age>13 && age<18){
        // System.out.println("teenages");
        // }
        // else{
        // System.out.println("Enter Correct Age");
        // }

        // EVen Odd
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if(number % 2 == 0){
        // System.err.println("Even");
        // } else {
        // System.out.println("ODD Number");
        // }

        // else if Statment
        // int age = 5;
        // if( age >=18){
        // System.out.println("Adult");
        // }
        // else if ( age>=13 && age<18){ // for savingcomipling time without check
        // condition give previus result
        // System.out.println("Teenager");
        // }
        // else{
        // System.out.println("Child");
        // }

        // Income Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Income: ");
        // int income = sc.nextInt();

        // float tax = 0;

        // if(income<500000){
        // tax=0;
        // }
        // else if(income>=500000 && income<1000000){
        // tax= income * 0.20f;
        // }
        // else{
        // tax= 0.30f * income;
        // }

        // System.out.println("Income Is: " + income + " tax: "+ tax);



        // print the Largest Of three number

        // Scanner sc = new Scanner(System.in);

        // int n1=1;
        // int n2= 3;
        // int n3 = 6;

        // if(n1>n2 && n1>n3){
        //     System.out.println("Number n1 is gratest: i,e "+n1);
        // }
        // else if(n2>n3){
        //     System.out.println("Number n2 is gratest: i,e "+n2);
        // }
        // else{
        //     System.out.println("number n3 is gratest: i,e "+n3);
        // }


        //Ternary Operator 

        // int num = 71;
        // String result = ((num%2)==0)? "Even" : "Odd";
        // System.out.println(result);


        // int marks = 13;
        // String result = (marks>=33)? "Pass" : "Fail";
        // System.out.println(result);



        // Switch Case 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A number (1-2-3): ");
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("Samosa");
        //         break;
        //     case 2:
        //         System.out.println("Burger");
        //         break;
        //     case 3:
        //         System.out.println("Mango Shake");
        //         break;
        
        //     default:
        //         System.out.println("Plz Select Correct Number !");
        //         break;
        // }




        //Calculator

        // int n1= 56;
        // int n2 = 4;


            // Practice Question 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Number Is positive!");
        }
        else{
            System.out.println("Negative");
        }
    }
}
