package Streak;

public class NexrPermutation {
    public static void findNextPermutation(int arr[]) {
        int bp = -1; // Index of the pivot

        // Step 1: Find the pivot (first element from right that is smaller than its next neighbor)
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                bp = i;
                break; // Stop immediately once found
            }
        }

        // If no pivot is found, the array is in descending order (e.g., [6, 5, 4, 3, 2, 1])
        if (bp != -1) {
            // Step 2: Find the successor (first element from right greater than arr[bp])
            int idx = -1;
            for (int i = arr.length - 1; i > bp; i--) {
                if (arr[i] > arr[bp]) {
                    idx = i;
                    break; // Stop immediately once found
                }
            }

            // Step 3: Swap pivot and successor
            int temp = arr[bp];
            arr[bp] = arr[idx];
            arr[idx] = temp;
        }

        // Step 4: Reverse the suffix elements after the pivot (index bp + 1 to end)
        int start = bp + 1;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print the final result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 5, 4, 1};
        // Call the method directly since it handles printing inside
        findNextPermutation(arr); 
    }
}
