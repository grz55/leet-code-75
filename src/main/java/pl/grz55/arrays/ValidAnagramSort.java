package pl.grz55.arrays;

import java.util.Arrays;

public class ValidAnagramSort {

    //    https://leetcode.com/problems/valid-anagram/

    //    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //    An Anagram is a word or phrase formed by rearranging the letters of a different word or
    // phrase, typically using all the original letters exactly once.

    //    Constraints:
    //            1 <= s.length, t.length <= 5 * 10^4
    //    s and t consist of lowercase English letters.

    public boolean isAnagram(String s, String t) {
        if (stringsBlankOrDifferentLength(s, t)) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }

    private boolean stringsBlankOrDifferentLength(String s, String t) {
        return s.isBlank() || t.isBlank() || s.length() != t.length();
    }
}
