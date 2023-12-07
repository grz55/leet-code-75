package pl.grz55.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    @Test
    void shouldSuccessOnAnagramStrings() {
        ValidAnagram validAnagram = new ValidAnagram();

        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldSuccessOnAnagramStrings2() {
        ValidAnagram validAnagram = new ValidAnagram();

        assertTrue(validAnagram.isAnagram("unitedstates", "ntdttsuiesae"));
    }

    @Test
    void shouldFailOnNonAnagramStrings() {
        ValidAnagram validAnagram = new ValidAnagram();

        assertFalse(validAnagram.isAnagram("car", "rat"));
    }

    @Test
    void shouldFailOnStringsDifferentLength() {
        ValidAnagram validAnagram = new ValidAnagram();

        assertFalse(validAnagram.isAnagram("draw", "write"));
    }

    @Test
    void shouldFailOnOneEmptyString() {
        ValidAnagram validAnagram = new ValidAnagram();

        assertFalse(validAnagram.isAnagram(" ", "plane"));
    }
}
