package pl.grz55.arrays;

public class ValidAnagram {

    //    https://leetcode.com/problems/valid-anagram/

    //    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //    An Anagram is a word or phrase formed by rearranging the letters of a different word or
    // phrase, typically using all the original letters exactly once.

    //    Constraints:
    //            1 <= s.length, t.length <= 5 * 10^4
    //    s and t consist of lowercase English letters.

    // Other solutions:
    // - prepare a frequency map from one array and decrement frequency with another array. If
    // frequencies are 0 arrays are an anagram

    public boolean isAnagram(String s, String t) {
        if (stringsBlankOrDifferentLength(s, t)) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        boolean[] boolArray = new boolean[s.length()];

        for (int i = 0; i < sCharArray.length; i++) {
            for (int j = 0; j < tCharArray.length; j++) {
                if (sameLetters(sCharArray[i], tCharArray[j]) && letterAlreadyUsed(boolArray[i])) {
                    boolArray[i] = true;
                    break;
                }
            }
        }
        return unusedLettersInArray(boolArray);
    }

    private boolean stringsBlankOrDifferentLength(String s, String t) {
        return s.isBlank() || t.isBlank() || s.length() != t.length();
    }

    private boolean sameLetters(char sChar, char tChar) {
        return sChar == tChar;
    }

    private boolean letterAlreadyUsed(boolean boolArray) {
        return !boolArray;
    }

    private boolean unusedLettersInArray(boolean[] boolArray) {
        for (boolean b : boolArray) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
