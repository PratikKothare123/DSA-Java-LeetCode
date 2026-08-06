package DivideAndConquer;

public class SortedRotatedSearch {

    public static int search(int arr[],int target,int si,int ei){

        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;

        if(arr[mid]==target){
            return mid;
        }


        //Mid On Left 
        if(arr[si]<=arr[mid]){
            //Case:A L1 of Left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                 //Case:B Mid-Left
                return search(arr, target, mid+1, ei);
            }
        }else{
            //Case:C 
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                //Case:D 
                return search(arr, target, si, mid-1);
            }

        }


        //Right
    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int target = 7;
        int tidx = search(arr, target, 0, arr.length-1);
        System.out.println("Target idx: "+tidx);
    }
}
