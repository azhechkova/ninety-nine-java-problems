package org.p08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem08Test {

    @Test
    @DisplayName("Has to return unique values in list")
    void compress() {
        List<Integer> list = List.of(1, 1, 1, 2, 3, 3, 3, 3);
        int[] expected = {1, 2, 3};

        List<Integer> result = Problem08.compress(list);
        int[] resultList = result.stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(resultList, expected);
    }
}