package Recursions;

public class ConvertNumToWords {

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void pritnDigit(int num){
        if (num==0){
            return;
        }

        int ld = num % 10;
        pritnDigit(num/10);
        System.out.print(digits[ld]+" ");
    }
    public static void main(String[] args) {
        int num = 1947;
        pritnDigit(num);
    }
}
//one nine four seven 