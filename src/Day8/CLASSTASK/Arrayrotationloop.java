package Day8.CLASSTASK;

import java.util.Arrays;
public class Arrayrotationloop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        int temp = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}