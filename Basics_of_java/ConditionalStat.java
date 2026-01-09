import java.util.Scanner;

public class ConditionalStat {
    public static void main(String[] args) {
        // int age = 16;
        // if(age>19){
        //     System.out.println("You Can Voe , Drive");
        // }
        // if(age>13 && age<18){
        //     System.out.println("teenages");
        // }
        // else{
        //     System.out.println("Enter Correct Age");
        // }


        // EVen Odd
        Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();

                if(number % 2 == 0){
                    System.err.println("Even");
                } else {
                    System.out.println("ODD Number");
                }
        
    }
}
