package pl.grz55.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidAnagramSortTest {

    @Test
    void shouldSuccessOnAnagramStrings() {
        ValidAnagramSort validAnagramSort = new ValidAnagramSort();

        assertTrue(validAnagramSort.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldSuccessOnAnagramStrings2() {
        ValidAnagramSort validAnagram = new ValidAnagramSort();

        assertTrue(validAnagram.isAnagram("unitedstates", "ntdttsuiesae"));
    }

    @Test
    void shouldFailOnNonAnagramStrings() {
        ValidAnagramSort validAnagram = new ValidAnagramSort();

        assertFalse(validAnagram.isAnagram("car", "rat"));
    }

    @Test
    void shouldFailOnStringsDifferentLength() {
        ValidAnagramSort validAnagram = new ValidAnagramSort();

        assertFalse(validAnagram.isAnagram("draw", "write"));
    }

    @Test
    void shouldFailOnOneEmptyString() {
        ValidAnagramSort validAnagram = new ValidAnagramSort();

        assertFalse(validAnagram.isAnagram(" ", "plane"));
    }
}
