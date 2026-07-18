package Recursions;

public class SortedArray {

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){ // if one array element presemt in array, so we write this condition  
            return true;
        }
        if(arr[i] > arr[i+1]){
          return false;
        }
         return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        System.out.println(isSorted(arr,0));
    }
}
