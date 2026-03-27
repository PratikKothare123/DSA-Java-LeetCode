package Arrays;

public class AppearsAtLeastTwice {
    public static boolean AppearsTwice(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {

                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 1,1,1,3,3,4,3,2,4,2};
        System.out.println(AppearsTwice(nums));
    }
}
