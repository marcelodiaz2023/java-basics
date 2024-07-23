import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Check String if palindrome: ");
        String stringInput = new String(s.next()), reverseString = "";

        for (int i = (stringInput.length() - 1); i >= 0; i--) {
            reverseString += stringInput.charAt(i);
        }

        if (reverseString.equals(stringInput))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}