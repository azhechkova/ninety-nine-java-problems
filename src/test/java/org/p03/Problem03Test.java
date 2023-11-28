package org.p03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class Problem03Test {
    @Test
    @DisplayName("Finds nth element in array")
    void nthInArray() {
        Integer[] list = {1, 1, 2, 3, 5, 8};

        Integer nthElement = Problem03.nth(2, list);

        assertEquals(nthElement, 2);
    }

    @Test
    @DisplayName("Throws exception if index is out of bounds")
    void nthOutOfBoundsInArray() {
        Integer[] list = {1, 1, 2};
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem03.nth(3, list));

        assertEquals("No such element", exception.getMessage());
    }

    @Test
    @DisplayName("Finds nth element in collection")
    void nthInCollection() {
        List<Integer> list = List.of(new Integer[]{1, 2, 3, 4});

        Integer nthElement = Problem03.nth(2, list);

        assertEquals(nthElement, 3);
    }

    @Test
    @DisplayName("Throws exception if index is out of bounds of collection")
    void nthOutOfBoundsInCollection() {
        List<Integer> list = List.of();
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem03.nth(3, list));

        assertEquals("No such element", exception.getMessage());
    }
}