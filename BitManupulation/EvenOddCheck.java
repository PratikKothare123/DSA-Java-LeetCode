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

    public static int getBit(int n, int i){

    int bitMask = 1 << i;

    if((n & bitMask) == 0){
        return 0;
    }

    return 1;
}
    public static void main(String[] args) {
        int n = 3;
        oddOrEven(n);
        System.out.println("getBit: "+getBit(15,2));
    }
    
}
