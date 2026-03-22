package Arrays;

import java.util.Scanner;

public class PrintSubarray {

    public static void PrintSubaaray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+ " ");
                }
                System.out.print("sum= "+sum);
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PrintSubaaray(arr);


    }
}
