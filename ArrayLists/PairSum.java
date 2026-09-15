package ArrayLists;

import java.util.ArrayList;

public class PairSum {

    //Brute Force Approach
    // public static boolean pairSum1(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Optimal Approach 
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        int sum = 0;
        while(lp!=rp){
            sum  = list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        

        

        System.out.println(list);
        int target = 19;

        // System.out.println(pairSum1(list,40));
        System.out.println(pairSum2(list,target));
    }
}
