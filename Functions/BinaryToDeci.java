package Functions;
import java.util.*;
public class BinaryToDeci {
    public static void BinaryToDeci(int binNum){
        int num = binNum;
        int dec=0;
        int pow = 0;
        while(binNum>0){
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum /10;
        }
     System.out.println("Binnary of "+num +" Is: "+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Binnary Number: ");
        int num = sc.nextInt();
        BinaryToDeci(num);
    
    }
}
