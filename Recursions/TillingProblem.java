package Recursions;

public class TillingProblem {

    public static int tilingProble(int n){  // 2 X n
        if(n==0 || n==1){
            return 1;
        }

        //vertical 
        int fnm1 = tilingProble(n-1);

        //Horizantal
        int fnm2 = tilingProble(n-2);

        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProble(n));
    }
}
