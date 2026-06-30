package Day7.classtask;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayMarksTotal {
    public static void main(String[] args){
        int[] marks=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks: ");
            marks[i] = sc.nextInt();
        }
        int totalMarks=0;
        for(int i=0;i<marks.length;i++){
            totalMarks=totalMarks+marks[i];
        }
        System.out.println("Total marks: "+totalMarks);
        System.out.println(Arrays.toString(marks));
    }
}
