package DivideAndConquer;

public class quickSort {

      public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void quickSort(int arr[],int si,int ei){

        //Base Case

        if(si>=ei){
            return;
        }
        //Last element
        int pIdx = partation(arr,si,ei);
        quickSort(arr, si, pIdx-1);//Left
        quickSort(arr, pIdx+1, ei); //Right
    
    }

    public static int partation(int arr[],int si,int ei){
        int pivot = arr[ei];

        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //Swap   
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
            }
        }

        // For placing  pivot at their exact position 
        i++;
        int temp = pivot;
        arr[ei]=arr[i]; //pivot = arr[i] this is wrong, Bcz. we pivot is varibale 
        arr[i] = temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        printArray(arr); //2 3 5 6 8 9 
    }
}
