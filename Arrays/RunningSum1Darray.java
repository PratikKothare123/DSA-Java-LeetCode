package Arrays;

public class RunningSum1Darray {
    public static int[] runningsum(int[] nums){
        int[] prevsum = new int[nums.length];
        prevsum[0]=nums[0];
        for(int i=1;i<prevsum.length;i++){
            prevsum[i]=prevsum[i-1]+nums[i];
        }
       return prevsum;
    }

    public static void main(String[] args) {
      int nums[]={3,1,2,10,1};
      int[] ans= runningsum(nums);

      for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
      }

    }
}

// 3 4 6 16 17 
