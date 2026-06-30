package Day7;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the stars in each side of square: ");
        int n = sc.nextInt();

        System.out.println("Hollow Square Star Pattern:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star for the boundary positions
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print spaces for the inside hollow part
                    System.out.print("  ");
                }
            }
            // Move to the next line after finishing each row
            System.out.println();
        }

        sc.close();
    }
}
