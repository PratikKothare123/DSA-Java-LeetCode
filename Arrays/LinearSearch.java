package Arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+ n + " Array element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Which element You want to Search: ");
        int key = sc.nextInt();

         for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Key "+ key +" Present in "+ (i+1) + " Position");
                break;
            }
         }
    }
    
}