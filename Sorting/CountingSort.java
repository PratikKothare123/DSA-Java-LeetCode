package Sorting;

public class CountingSort {

    public static void Printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void CountingSorts(int arr[]){
        int largest = Integer.MIN_VALUE;
        //Find Maximum Number i,e Range
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        //Create count array for storing frequency of each element

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //Sorting Logic
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSorts(arr);
        Printarray(arr);            
    }
    
}
//1 1 2 3 3 4 4 7 