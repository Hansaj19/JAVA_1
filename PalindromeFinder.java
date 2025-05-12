import java.util.Scanner;

public class PalindromeFinder {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner jin = new Scanner(System.in);
        String input = jin.nextLine();

        String[] s1arr = input.split(" ");
        String[] s2arr = new String[s1arr.length];

        // Reverse the array of words
        for (int i = 0; i < s1arr.length; i++) {
            s2arr[i] = s1arr[s1arr.length - 1 - i];
        }

        String longestPalindrome = "";
        int max = 0;

        // Compare words from the original array and the reversed array
        for (int i = 0; i < s1arr.length; i++) {
            String word = s1arr[i];
            // Check if the word is a palindrome
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (word.equals(reversedWord)) {
                int len = word.length();
                if (len > max) {
                    max = len;
                    longestPalindrome = word;
                }
            }
        }

        if (longestPalindrome.isEmpty()) {
            System.out.println("No palindromic words found.");
        } else {
            int len2=longestPalindrome.length()-1;
            System.out.println("The longest palindromic word is: " + longestPalindrome.substring(1,len2));
        }
    }
}
