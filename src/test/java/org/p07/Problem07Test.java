package org.p07;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07Test {

    @Test
    @DisplayName("Should return flattened list")
    void flatten() {
        List<List<Integer>> list = List.of(List.of(1, 2, 3), List.of(3, 4, 5));

        List<Integer> result = Problem07.flatten(list);

        int[] resultList = result.stream().mapToInt(Integer::intValue).toArray();
        int[] expectedList = {1, 2, 3, 3, 4, 5};

        assertArrayEquals(resultList, expectedList);
    }
}