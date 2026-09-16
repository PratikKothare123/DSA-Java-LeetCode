import java.util.*;

public class LonelyNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            boolean isLonely = true;
            int current = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                // Don't compare a number with itself at the same position
                if (i != j) {
                    // 3 conditions: matches the number, or is 1 less, or is 1 more
                    if (list.get(j) == current || list.get(j) == current - 1 || list.get(j) == current + 1) {
                        isLonely = false; 
                        break; // No need to check further for this number
                    }
                }
            }

            // If it passed all checks, it's a lonely number
            if (isLonely) {
                result.add(current);
            }
        }

        System.out.println("Lonely Numbers: " + result); 
        // Output: [10, 8]
    }
}
