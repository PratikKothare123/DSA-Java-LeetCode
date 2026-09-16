package ArrayLists;

import java.util.ArrayList;

public class PairSum2SortedRotated {

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        
        // BUG FIX 1 & 2: Loop safely up to n-1 and check where the sequence drops
        for(int i = 0; i < n - 1; i++){
            if(list.get(i) > list.get(i+1)){ // Breaking point is where current > next
                bp = i; 
                break;
            }
        }

        // Handle case where array is sorted but NOT rotated
        if (bp == -1) {
            bp = n - 1;
        }

        int lp = (bp + 1) % n; // Smallest element pointer    
        int rp = bp;           // Largest element pointer

        while(lp != rp){
            int currentSum = list.get(lp) + list.get(rp);
            
            // Case-1: Target found
            if(currentSum == target){
                return true;
            }
            
            // Case-2: Sum is less than target, move left pointer forward
            if(currentSum < target){
                lp = (lp + 1) % n;
            } else { // Case-3: Sum is greater than target, move right pointer backward
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target)); // Output: true (10 + 6 = 16)
    }
}
