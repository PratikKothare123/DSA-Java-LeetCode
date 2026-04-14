// package Arrays;

// public class Maximum_Product_Subarray {
//     public static int MaxProduct(int num[]){
//         int ms= Integer.MIN_VALUE;
//         int cs=1;
//         for(int i=0;i<num.length;i++){
//             cs=cs*num[i];

//             ms=Math.max(cs, ms);
//         }
//         return ms;
//     }
    
//     public static void main(String[] args) {
//         int num[]={-1,-2,-3};
//         int result=MaxProduct(num);
//         System.out.println(result);
//     }
// }
package Arrays;

public class Maximum_Product_Subarray {

    public static int MaxProduct(int nums[]){

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){

            // If negative, swap max and min
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            result = Math.max(result, max);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-1, -2, -3};
        System.out.println(MaxProduct(nums));
    }
}