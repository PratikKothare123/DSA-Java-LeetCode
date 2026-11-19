package Arrays;

public class MoveNegatives {
    public static void main(String[] args) {

        int[] arr = {2, -3, 5, -1, 0, -8, 4};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        System.out.print("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
