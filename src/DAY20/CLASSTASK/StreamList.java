package DAY20.CLASSTASK;

import java.util.stream.Stream;

public class StreamList {
    public static void main(String [] args){
        Stream.iterate(0,n->n+2).limit(10).forEach(n->System.out.println(n));
    }
}