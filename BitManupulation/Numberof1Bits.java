package BitManupulation;

public class Numberof1Bits {
     public static int hammingWeight(int n) {
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println("Count: "+hammingWeight(n));
    }
}
