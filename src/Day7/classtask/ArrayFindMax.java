package Day7.classtask;

public class ArrayFindMax {
    public static void main(String[] args){
        int[]nums={1,2,3,4,5};
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("the maximun value is: " + max);
    }
}
