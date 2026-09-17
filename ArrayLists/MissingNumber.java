import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        int n = 6;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < list.size(); i++) {
            actualSum += list.get(i);
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}