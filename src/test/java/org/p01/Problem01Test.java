package org.p01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Problem01Test {

    @Test
    @DisplayName("Finds last element in array")
    void findLastElementInArray() {
        String[] list = {"first", "second", "third"};

        String lastElement = Problem01.last(list);

        assertEquals(lastElement, "third");
    }

    @Test
    @DisplayName("Finds last element in collection")
    void findLastElementInCollection() {
        List<Integer> list = List.of(new Integer[]{1, 2, 3, 4});

        Integer lastElement = Problem01.last(list);

        assertEquals(lastElement, 4);
    }

    @Test
    @DisplayName("Finds last element in empty list")
    void findLastElementInEmptyList() {
        String[] list = new String[]{};
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem01.last(list));
        assertEquals("No such element", exception.getMessage());
    }

    @Test
    @DisplayName("Finds last element in empty collection")
    void findLastElementInEmptyCollection() {
        List<Integer> list = List.of();
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem01.last(list));
        assertEquals("No such element", exception.getMessage());
    }
}