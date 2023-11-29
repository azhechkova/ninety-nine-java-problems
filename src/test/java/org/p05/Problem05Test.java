package org.p05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem05Test {

    @Test
    @DisplayName("Reverse a list")
    void reverse() {
        List<Integer> list = List.of(1, 2, 3, 4);

        List<Integer> result = Problem05.reverse(list);

        int[] resultList = result.stream().mapToInt(Integer::intValue).toArray();
        int[] expectedList = {4, 3, 2, 1};

        assertArrayEquals(expectedList, resultList);
    }
}