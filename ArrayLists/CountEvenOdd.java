import java.util.ArrayList;
import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args) {
        //  ArrayList<Integer> nums = new ArrayList<>();

        // nums.add(10);
        // nums.add(15);
        // nums.add(20);
        // nums.add(25);
        // nums.add(30);

        // System.out.println(nums);
        // int evencount=0;
        // int oddcountt = 0;

        // for(int i=0;i<nums.size();i++){
        //     if(nums.get(i)%2==0){
        //         evencount++;
        //     }else{
        //         oddcountt++;
        //     }
        // }

        // System.out.println("Even Count: "+evencount+" Odd Count: "+oddcountt);


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(-5);
        nums.add(0);
        nums.add(20);
        nums.add(-3);
        nums.add(0);

        System.out.println(nums);
        int positive=0;
        int negative = 0;
        int zero=0;

        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>0){
                positive++;
            }else if(nums.get(i)<0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+zero);

    }



}
