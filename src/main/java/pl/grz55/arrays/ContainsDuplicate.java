package pl.grz55.arrays;

public class ContainsDuplicate {

    // https://leetcode.com/problems/contains-duplicate/

    // Given an integer array nums, return true if any value appears at least twice in the array,
    // and return false if every element is distinct.

    // Other solutions:
    // - Arrays.sort() the array and check equality of adjacent numbers
    // - Adding numbers to HashSet and checking if added number exists

    public boolean containsDuplicate(int[] numbers) {
        if (numbers.length == 0 || numbers.length == 1) {
            return false;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
