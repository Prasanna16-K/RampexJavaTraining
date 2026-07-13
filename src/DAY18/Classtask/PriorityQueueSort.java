package DAY18.Classtask;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            pq.add(num);
        }
        System.out.println("\nSorted values:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}
