// package Arrays;

// public class MajorityElement {

//     public static int MajoriytEle(int nums[] ){
//         for(int i=0;i<nums.length;i++){
//             int freq=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     freq++;
//                 }
//             }
//             if(freq> (nums.length/2)){
//                 return nums[i];
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int nums[]={2,2,1,1,1,2,2};
//         int ans = MajoriytEle(nums);
//         System.out.println(ans);
//     }
// }
package Arrays;
import java.util.Arrays;

public class MajorityElement {

    public static int MajoriytEle(int nums[] ){
       Arrays.sort(nums);
       int freq=1,ans=nums[0];
       for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
                freq=1;
                ans=nums[i];
            }
            if(freq>(nums.length/2)){
                return ans;
            }
            
       }
       return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int ans = MajoriytEle(nums);
        System.out.println(ans);
    }
}
