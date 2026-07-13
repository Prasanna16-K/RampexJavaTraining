package Day9.Classtask;


public class PalindromeCheck {
    public static void main(String[] a) {
        String s = "racecar";
        // create a char array  -
        // add the characters into that Array-
        //Reverse that array-
        // convert that Array to String using method;-
        //compare original and reversed print true or false -
        char[] ch = new char[s.length()];
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(n - 1 - i);
        }
        String rev = "";
        for (int i = 0; i < ch.length; i++) {
            rev = rev + ch[i];
        }
        //System.out.println("checking "+ rev);
        if (s.equals(rev)) {

            System.out.print("pallindrome");
        } else {

            System.out.println("not palindrome");
        }
    }
}
