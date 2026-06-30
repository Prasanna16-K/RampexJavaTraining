package Day8.CLASSTASK;

import java.util.Arrays;
public class Arrayrotation {
    public static void main(String[] args){
        int [] nums={1,2,3,4};
        int temp=nums[0];
        nums[0]=nums[3];
        nums[3]=temp;

        temp=nums[1];
        nums[1]=nums[2];
        nums[2]=temp;
        System.out.println(Arrays.toString(nums));
    }
}
