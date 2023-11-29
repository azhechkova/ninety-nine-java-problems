package org.p06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Problem06Test {

    @Test
    @DisplayName("Should return true for palindrome array")
    void isPalindromeArray() {
        Integer[] list = {1, 2, 3, 2, 1};

        boolean result = Problem06.palindrome(list);

        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true for palindrome odd array")
    void isPalindromeOddArray() {
        Integer[] list = {1, 2, 2, 2, 2, 1};

        boolean result = Problem06.palindrome(list);

        assertTrue(result);
    }

    @Test
    @DisplayName("Should return false for non palindrome array")
    void isNotPalindromeArray() {
        Integer[] list = {1, 2, 3, 3, 3};

        boolean result = Problem06.palindrome(list);

        assertFalse(result);
    }
}