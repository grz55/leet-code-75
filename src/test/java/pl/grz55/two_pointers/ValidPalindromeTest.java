package pl.grz55.two_pointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidPalindromeTest {

    @ParameterizedTest
    @ValueSource(
            strings = {
                "A man, a plan, a canal: Panama",
                "radar",
                " ",
                "validpalindromeemordnilapdilav",
                "testtset",
                "a",
                "aa"
            })
    void shouldSuccessOnValidPalindromes(String palindrome) {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertTrue(validPalindrome.isPalindrome(palindrome));
    }

    @ParameterizedTest
    @ValueSource(strings = {"race a car", "bodybuilding", "something invalid", "ab"})
    void shouldFailOnInvalidPalindromes(String palindrome) {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertFalse(validPalindrome.isPalindrome(palindrome));
    }
}
