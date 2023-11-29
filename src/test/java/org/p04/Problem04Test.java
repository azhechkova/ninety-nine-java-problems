package org.p04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem04Test {

    @Test
    @DisplayName("Length of array")
    void lengthArray() {
        String[] list = {"1", "2", "3"};

        int result = Problem04.length(list);

        assertEquals(result, 3);
    }

    @Test
    @DisplayName("Length of collection")
    void lengthList() {
        List<String> list = List.of("1", "2", "3");

        int result = Problem04.length(list);

        assertEquals(result, 3);
    }
}