package Day7;

public class NumberPattern {
    public static void main(String[] args) {
        // Upper part of the pattern including the middle '5'
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
