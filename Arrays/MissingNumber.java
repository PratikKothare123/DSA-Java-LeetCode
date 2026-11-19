package Arrays;


public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};

        int n = 6;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}

