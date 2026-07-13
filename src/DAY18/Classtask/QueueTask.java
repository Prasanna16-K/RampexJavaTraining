package DAY18.Classtask;

import java.util.ArrayDeque;
public class QueueTask {
    public static void main(String[] args){
        String [] task={"Download","Compile","Test","Deploy"};
        ArrayDeque<String> dq=new ArrayDeque<String>();
        for(String t: task){
            dq.add(t);
        }
        for(String t: dq){
            System.out.print(t+"->");
        }
    }
}
