package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(34);
        nums.add(41);
        nums.add(60);
        nums.add(21);


        // for(int n:nums){
        //     System.out.print(n+" ");   //34 41 60 21  
        // }
      
        Collections.sort(nums);
        System.out.println(nums); //[21, 34, 41, 60]


        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums); //[60, 41, 34, 21]


        

    }
}
