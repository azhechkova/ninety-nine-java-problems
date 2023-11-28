package org.p02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class Problem02Test {
    @Test
    @DisplayName("Finds second last element in array")
    void findLastElementInArray() {
        String[] list = {"first", "second", "third"};

        String lastElement = Problem02.penultimate(list);

        assertEquals(lastElement, "second");
    }

    @Test
    @DisplayName("Finds second last element in collection")
    void findLastElementInCollection() {
        List<Integer> list = List.of(new Integer[]{1, 2, 3, 4});

        Integer lastElement = Problem02.penultimate(list);

        assertEquals(lastElement, 3);
    }

    @Test
    @DisplayName("Finds second last element in list of one element")
    void findLastElementInEmptyList() {
        String[] list = new String[]{"first"};
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem02.penultimate(list));
        assertEquals("No such element", exception.getMessage());
    }

    @Test
    @DisplayName("Finds second last element in empty collection")
    void findLastElementInEmptyCollection() {
        List<Integer> list = List.of();
        Throwable exception = assertThrows(NoSuchElementException.class, () -> Problem02.penultimate(list));
        assertEquals("No such element", exception.getMessage());
    }
}