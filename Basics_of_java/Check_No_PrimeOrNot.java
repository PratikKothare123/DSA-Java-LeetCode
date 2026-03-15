import java.util.*;
public class Check_No_PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();


        if (num ==2){
            System.out.println(num +"is  a Prime Number");
        }else{
            boolean isPrime = true;

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isPrime = false; 
            }
        }
        if(isPrime==true){
            System.out.println(num +"is a Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
        }
        
        
    }
}
