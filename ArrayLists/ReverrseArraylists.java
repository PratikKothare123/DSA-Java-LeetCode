package ArrayLists;

import java.util.*;
public class ReverrseArraylists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(90);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);

        System.out.println(nums.size());

        //Print Array Lists in Revrse order 
        // for(int i=nums.size()-1;i>=0;i--){
        //     System.out.print(nums.get(i)+" ");
        // }


        //Find Maximum in an Array list 

        int max = nums.get(0);
        for(int i=1;i<nums.size();i++){
                if(max<nums.get(i)){
                    max = nums.get(i);
                }
        }
         System.out.println(max);
        


    }
}
