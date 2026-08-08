package Streak;
import java.util.Arrays;

/**
 * Problem: Find the Duplicate Number (Floyd's Cycle Detection Algorithm)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Solution {

    /**
     * Finds the duplicate number in an array containing n + 1 integers 
     * where each integer is in the range [1, n] inclusive.
     *
     * @param nums Array of integers
     * @return The duplicate integer
     */
    public static int findDuplicate(int[] nums) {
        // Step 1: Initialize slow and fast pointers to detect the cycle
        int slow = nums[0];
        int fast = nums[0];

        // Advance pointers until they intersect inside the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find the entrance to the cycle (the duplicate number)
        int ptr1 = nums[0];
        int ptr2 = slow;

        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 3, 4, 2, 2};
        
        System.out.println("Input Array: " + Arrays.toString(testArray));
        int duplicate = findDuplicate(testArray);
        System.out.println("Duplicate Number: " + duplicate);
    }
}