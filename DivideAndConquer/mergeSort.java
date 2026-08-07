package DivideAndConquer;

public class mergeSort {

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
    public static void mergeSorts(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2; //(si+ei)/2
        // System.out.println("Mid: " + mid); 
        mergeSorts(arr, si, mid);
        mergeSorts(arr, mid+1, ei);

        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int [ei-si+1];
        int  i = si; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp array

        while(i<=mid && j <=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover element for 1st sorted array

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //for leftover element for 2nd sorted array
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //Copy temp to orignal array

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        printArray(arr);
        mergeSorts(arr,0, arr.length-1);
        printArray(arr);
        
    }
}
