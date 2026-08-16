package Sorting;

public class modifiedBubbleSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swaped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped = true;
                }
            }
            if(swaped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,9,5,6};
        bubbleSort(arr);
        printArray(arr);
    }
}
