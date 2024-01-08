package pl.grz55.stack;

import java.util.*;

public class ValidParentheses {

    private final Map<Character, Character> openCloseParenthesesMap = new HashMap<>();

    public ValidParentheses() {
        prepareOpenCloseParenthesesMap();
    }

    private void prepareOpenCloseParenthesesMap() {
        this.openCloseParenthesesMap.put('(', ')');
        this.openCloseParenthesesMap.put('{', '}');
        this.openCloseParenthesesMap.put('[', ']');
    }

    // https://leetcode.com/problems/valid-parentheses/

    //    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
    //    if the input string is valid.
    //
    //    An input string is valid if:
    //
    //    Open brackets must be closed by the same type of brackets.
    //    Open brackets must be closed in the correct order.
    //    Every close bracket has a corresponding open bracket of the same type.

    // Constraints: s consists of parentheses only '()[]{}'.

    public boolean isValid(String input) {
        int inputLength = input.length();

        if (lengthOdd(inputLength)) {
            return false;
        }

        Deque<Character> openParenthesesStack = new ArrayDeque<>();

        if (isFirstCharacterClosingParenthesis(input)) {
            return false;
        } else {
            openParenthesesStack.push(input.charAt(0));
        }

        for (int i = 1; i < inputLength || openParenthesesStack.size() > (inputLength / 2); i++) {
            char analyzedCharacter = input.charAt(i);
            if (isCharacterOpeningParenthesis(analyzedCharacter)) {
                openParenthesesStack.push(analyzedCharacter);
            } else {
                if (!openCloseParenthesesMap
                        .get(openParenthesesStack.pop())
                        .equals(analyzedCharacter)) {
                    return false;
                }
            }
        }
        return openParenthesesStack.isEmpty();
    }

    private boolean lengthOdd(int inputLength) {
        return inputLength % 2 != 0;
    }

    private boolean isFirstCharacterClosingParenthesis(String input) {
        return input.charAt(0) == ')' || input.charAt(0) == '}' || input.charAt(0) == ']';
    }

    private boolean isCharacterOpeningParenthesis(char analyzedCharacter) {
        return openCloseParenthesesMap.containsKey(analyzedCharacter);
    }
}
