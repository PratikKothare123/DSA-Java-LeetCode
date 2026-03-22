// package Arrays;

// import java.util.Scanner;

// public class SubaaraySum {

//     public static void SubArraySum(int arr[]){
//         int Currsum=0;
//         int maxSum = Integer.MIN_VALUE;
        
//         for(int i=0;i<arr.length;i++){
//             int start = i;
//             for(int j=i;j<arr.length;j++){
//                 int end = j;
//                 Currsum=0;
//                 for(int k=start;k<=end;k++){
//                     Currsum+=arr[k];
//                 }
                
//                 System.out.println(Currsum);
//                 if(maxSum<Currsum){
//                     maxSum = Currsum;
//                 }
//             }
           
//         }
//         System.out.println("Maximum Sum= "+maxSum);
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Size of Array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter " + n + " Array element");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         SubArraySum(arr);


//     }
// }





// Max SubArray sum - II     (Prefix Sum)


package Arrays;

import java.util.Scanner;

public class SubaaraySum {

    public static void SubArraySum(int arr[]){
        int Currsum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length]; 


        prefixSum[0]=arr[0];
        // Calculae prefix Sum
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]= prefixSum[i-1]+arr[i];
        }

        


        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                Currsum=start == 0 ? prefixSum[end]: prefixSum[end]-prefixSum[start-1];
                
                if(maxSum<Currsum){
                    maxSum = Currsum;
                }
            }
           
        }
        System.out.println("Maximum Sum= "+maxSum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SubArraySum(arr);


    }
}

