package Day11.Classtask;

class CheckArmstrong {
    public static void main(String[] args) {
        int num = 16122006;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digit = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }

        // Calculate sum of powers
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digit);
            temp = temp / 10;
        }

        System.out.println("The calculated sum is " + sum);
        return sum == originalNum;
    }
}
