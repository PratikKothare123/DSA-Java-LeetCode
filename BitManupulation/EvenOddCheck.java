package BitManupulation;

public class EvenOddCheck {
    public static void oddOrEven(int n){
        int bitmask =1;
        if((n & bitmask)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        oddOrEven(n);
    }
    
}
