// import java.util.Scanner;

// public class ConditionalStat {
//     public static void main(String[] args) {
//         // int age = 16;
//         // if(age>19){
//         // System.out.println("You Can Voe , Drive");
//         // }
//         // if(age>13 && age<18){
//         // System.out.println("teenages");
//         // }
//         // else{
//         // System.out.println("Enter Correct Age");
//         // }

//         // EVen Odd
//         // Scanner sc = new Scanner(System.in);
//         // int number = sc.nextInt();

//         // if(number % 2 == 0){
//         // System.err.println("Even");
//         // } else {
//         // System.out.println("ODD Number");
//         // }

//         // else if Statment
//         // int age = 5;
//         // if( age >=18){
//         // System.out.println("Adult");
//         // }
//         // else if ( age>=13 && age<18){ // for savingcomipling time without check
//         // condition give previus result
//         // System.out.println("Teenager");
//         // }
//         // else{
//         // System.out.println("Child");
//         // }

//         // Income Tax Calculator
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter Your Income: ");
//         // int income = sc.nextInt();

//         // float tax = 0;

//         // if(income<500000){
//         // tax=0;
//         // }
//         // else if(income>=500000 && income<1000000){
//         // tax= income * 0.20f;
//         // }
//         // else{
//         // tax= 0.30f * income;
//         // }

//         // System.out.println("Income Is: " + income + " tax: "+ tax);

//         // print the Largest Of three number

//         // Scanner sc = new Scanner(System.in);

//         // int n1=1;
//         // int n2= 3;
//         // int n3 = 6;

//         // if(n1>n2 && n1>n3){
//         // System.out.println("Number n1 is gratest: i,e "+n1);
//         // }
//         // else if(n2>n3){
//         // System.out.println("Number n2 is gratest: i,e "+n2);
//         // }
//         // else{
//         // System.out.println("number n3 is gratest: i,e "+n3);
//         // }

//         // Ternary Operator

//         // int num = 71;
//         // String result = ((num%2)==0)? "Even" : "Odd";
//         // System.out.println(result);

//         // int marks = 13;
//         // String result = (marks>=33)? "Pass" : "Fail";
//         // System.out.println(result);

//         // Switch Case
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter A number (1-2-3): ");
//         // int num = sc.nextInt();
//         // switch (num) {
//         // case 1:
//         // System.out.println("Samosa");
//         // break;
//         // case 2:
//         // System.out.println("Burger");
//         // break;
//         // case 3:
//         // System.out.println("Mango Shake");
//         // break;

//         // default:
//         // System.out.println("Plz Select Correct Number !");
//         // break;
//         // }

//         // Calculator

//         // int n1= 56;
//         // int n2 = 4;

//         // Practice Question
//         // Check Number is positive or not

//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter A Number: ");
//         // int num = sc.nextInt();
//         // if(num>=0){
//         // System.out.println("Number Is positive!");
//         // }
//         // else{
//         // System.out.println("Negative");
//         // }

//         // Temperature check fever or not
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter Temperature: ");
//         // double temp = sc.nextFloat();
//         // if(temp>=100){
//         // System.out.println("you have fever! ");
//         // }
//         // else{
//         // System.out.println("You Don't have fever ");
//         // }

//         // Switch Case: find day of particular number
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter number: (1-7): ");
//         // int num = sc.nextInt();
//         // switch (num) {
//         // case 1:
//         // System.out.println("Monday");
//         // break;
//         // case 2:
//         // System.out.println("Tuesday");
//         // break;
//         // case 3:
//         // System.out.println("Wednesday");
//         // break;
//         // case 4:
//         // System.out.println("Thursday");
//         // break;
//         // case 5:
//         // System.out.println("Friday");
//         // break;
//         // case 6:
//         // System.out.println("Saturday");
//         // break;
//         // case 7:
//         // System.out.println("Sunday");
//         // break;
//         // default:
//         // System.out.println("Plz Enter Correct Number!");
//         // break;
//         // }

//     // Check Leap Year
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Any year:");
//     int year = sc.nextInt();
//     if(year%4==0){
//         if(year%100==0){
//              if(year%400==0){
//                 System.out.println("Leap year");
//              }
             
//         }else{
//             System.out.println("leap year");
//         }
       
//     }
//     else{
//         System.out.println("not A leap Year");
//     }





//     }
// }
