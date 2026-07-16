package DAY20.CLASSTASK;

import java.util.Arrays;
public class StreamDemo {
    public static void main(String[] args){
        int[] arr={1,2,4,3,5,6,7,5,9,8};
        Arrays.stream(arr).filter((n)->n%2==0).forEach(n->System.out.println(n));
    }
}
