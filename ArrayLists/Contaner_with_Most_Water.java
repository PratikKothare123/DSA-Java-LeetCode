package ArrayLists;

import java.util.*;

public class Contaner_with_Most_Water {

    //Brute Forse
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;

    //     //Brute Force --> O(n*n) i,e 
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater,currWater);
    //         }
    //     }
    //     return maxWater;
    // }


    //Two Pointer Approach -> O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp=0;
        int rp = height.size()-1;
        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int wt = rp-lp;
            int currWater = ht*wt;
            maxWater = Math.max(maxWater,currWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);

        System.out.println("Maximum Water= " +storeWater(height));
        



    }
}
