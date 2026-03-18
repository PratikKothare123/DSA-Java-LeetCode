package Arrays;
import java.util.*;
public class BasicArray {


    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;

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

       int ans = getLargest(arr);
       System.out.println("Largest Element = "+ans);

   
    }
}
