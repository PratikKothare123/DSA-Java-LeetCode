//Selection Sort repeatedly finds the smallest element from the unsorted part of the array and places it at the beginning.

package Sorting;

public class selectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[minPos]>arr[j]){
                minPos=j;
               }
            }
            //Swap 
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i]= temp;
        }
    }

    public static void Printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        Printarray(arr);
    }
}

//1 2 3 4 5 