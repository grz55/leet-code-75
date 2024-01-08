package pl.grz55.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidParenthesesTest {

    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}", "()[{}]"})
    void shouldSuccessOnValidParentheses(String input) {
        ValidParentheses validParentheses = new ValidParentheses();

        assertTrue(validParentheses.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]", ")(", "()[{()]}", "()[{}](("})
    void shouldFailOnInvalidParentheses(String input) {
        ValidParentheses validParentheses = new ValidParentheses();

        assertFalse(validParentheses.isValid(input));
    }

    @Test
    void shouldFailOnOddLengthInput() {
        ValidParentheses validParentheses = new ValidParentheses();

        assertFalse(validParentheses.isValid("(])"));
    }
}
