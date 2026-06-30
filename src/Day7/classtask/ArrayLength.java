package Day7.classtask;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayLength {
    public static void main(String[] args){
        int[] marks=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(marks));
    }
}
