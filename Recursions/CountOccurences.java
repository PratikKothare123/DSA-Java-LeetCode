// package Recursions;

// public class CountOccurences {
//     public static void allOccurences(int arr[],int key,int i){
//         if(i == arr.length){
//             return;
//         }
        

//         if(arr[i]==key){
//             System.out.print(i+" ");
//         }

//         allOccurences(arr,key,i+1);

//     }
//     public static void main(String[] args) {
//         int arr[] = {3,2,4,5,6,2,7,2,2};
//         int key = 2;
//         allOccurences(arr,key,0);
        
//     }
// }


//Print last occurence of array
package Recursions;

public class CountOccurences {
    public static void allOccurences(int arr[],int key,int i){
        if(i < 0){
            return;
        }
        

        if(arr[i]==key){
            System.out.print(i+" ");
            return;
        }

        allOccurences(arr,key,i-1);

    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,3,4,10};
        int key = 2;
        allOccurences(arr,key,arr.length-1);
        System.out.println();
    }
}
//2