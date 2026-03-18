package Arrays;

import java.util.*;

public class BinarySearch {

    public static int Binnary(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid + 1;

            } else {
                start = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element you want to search:");
        int key = sc.nextInt();
        int result = Binnary(arr, key);
        System.out.println("Element present in " + (result + 1) + " Position");

    }
}
