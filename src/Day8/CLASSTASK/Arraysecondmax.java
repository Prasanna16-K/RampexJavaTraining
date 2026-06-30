package Day8.CLASSTASK;

public class Arraysecondmax {
    public static void main(String[] args){
        int nums[]={1,2,43,57,4};
        int Smax=0;
        int max=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>max){
                Smax=max;
                max=nums[i];

            }else if (nums[i] > Smax && nums[i] != max) {
                Smax = nums[i];
            }
        }
        System.out.println("the maximum value: "+max);
        System.out.println("the second maximum value: "+Smax);
    }
}
