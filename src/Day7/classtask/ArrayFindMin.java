package Day7.classtask;

public class ArrayFindMin {
    public static void main(String[] args){
        int[]nums={1,2,3,4,5};
        int min=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("the minimum value is: " + min);
    }
}