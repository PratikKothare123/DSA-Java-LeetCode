package Arrays;

public class target_in_a_rotated_sorted_array {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            // Target found
            if(nums[mid] == target){
                return mid;
            }

            // Check if left half is sorted
            if(nums[left] <= nums[mid]){

                // Target lies in left half
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else{

                // Target lies in right half
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }

        return -1; // Not found
    }
        

    public static void main(String[] args){

        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(nums, target);

        System.out.println("Index = " + result);
    }
}
