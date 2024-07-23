import java.util.*;

public class Palindrome {
    private static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args){
        
        System.out.println("*Palindrome Checker*");
        System.out.print("Enter the word : ");
        String stringInput = scanner.next();
        boolean isPalindrome = PalindromeChecker(stringInput);
        System.out.println(stringInput + " is " + (isPalindrome?"a Palindrome":"not Palindrome"));
        
    }

    private static boolean PalindromeChecker(String stringInput){
        
        int left = 0;
        int right = stringInput.length()-1;
        while(left < right){
            if(stringInput.charAt(right) != stringInput.charAt(left)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
