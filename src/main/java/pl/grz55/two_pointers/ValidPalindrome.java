package pl.grz55.two_pointers;

public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/

    //    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    //    and removing all non-alphanumeric characters, it reads the same forward and backward.
    //    Alphanumeric characters include letters and numbers.

    public boolean isPalindrome(String input) {
        String alphaNumericInput = transformToAlphaNumericInput(input);
        String lowerCaseAlphaNumericInput = alphaNumericInput.toLowerCase();
        char[] inputArray = lowerCaseAlphaNumericInput.toCharArray();

        for (int i = 0; i < inputArray.length / 2; i++) {
            if (inputArray[i] != inputArray[inputArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private String transformToAlphaNumericInput(String input) {
        return input.replaceAll("[^A-Za-z0-9]", "");
    }
}
