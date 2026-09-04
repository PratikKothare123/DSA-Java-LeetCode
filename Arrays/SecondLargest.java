package Arrays;
import java.util.*;
class SecondLargest{
    public static void main(String[] args) {
        int arr[]={10,5,20,8,15};
        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second=large;
                large=arr[i];
            }
            else if(arr[i]>second && arr[i]!=large){
                second=arr[i];
            }
        }

        System.out.println(second);

    }
}