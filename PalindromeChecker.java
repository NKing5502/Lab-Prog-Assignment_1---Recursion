import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word and we will check if it is a palindrome!");

        String word = input.nextLine();

        boolean isPalindrome = isPalindrome(word, 0, word.length() - 1);

        if (isPalindrome) {
            System.out.println("Congratulations, the word you entered is a palindrome!");
        } else {
            System.out.println("Sorry, the word you entered is not a palindrome.");
        }

        input.close();
    }

    public static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        } else if (input.charAt(start) != input.charAt(end)) {
            return false;
        } else {
            return isPalindrome(input, start + 1, end - 1);
        }
    }
}