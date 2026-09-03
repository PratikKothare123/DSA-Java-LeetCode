package ArrayLists;

import java.util.ArrayList;

public class SwapTwoNumbers {

    public static void swapNum(ArrayList<Integer> nums,int idx1,int idx2){
        int temp = nums.get(idx1);
        nums.set(idx1,nums.get(idx2));
        nums.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);


        int idx1 = 1,idx2=3;
        System.out.println(nums);   // [1, 2, 3, 4, 5] 
        swapNum(nums,idx1,idx2);
        System.out.println(nums);   // [1, 4, 3, 2, 5]


    }
}
