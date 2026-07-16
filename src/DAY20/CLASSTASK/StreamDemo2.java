package DAY20.CLASSTASK;

import java.util.Arrays;
import java.util.ArrayList;
public class StreamDemo2 {
    public static void main(String[] args){
        int[] arr={1,2,4,3,5,6,7,5,9,8};

        ArrayList<Integer>li=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(li);
        li.stream().map(n->n*2).forEach(n->System.out.println(n));
    }
}
