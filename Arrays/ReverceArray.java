package Arrays;

import java.util.*;



public class ReverceArray {

    public static void Reverce(int arr[]){
        int start=0,end=arr.length - 1;
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+ n + " Array element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        Reverce(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
