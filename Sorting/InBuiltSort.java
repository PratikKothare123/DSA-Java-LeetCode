package Sorting;

import java.util.Arrays;
import java.util.Collections;


public class InBuiltSort{

    public static void Printarray(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};   //Object type Integer. reverseOrder() works only with objects.
        // Arrays.sort(arr);     
        // // 1 2 3 4 5 
        // Arrays.sort(arr, 0, 3); 
        // // 1 4 5 3 2 
        // Printarray(arr);


        //For Reverse Order
        // Arrays.sort(arr, Collections.reverseOrder());
        // Printarray(arr);
        // 5 4 3 2 1 

        Arrays.sort(arr,0,3,Collections.reverseOrder());
        Printarray(arr);
        // 5 4 1 3 2 
    }
}