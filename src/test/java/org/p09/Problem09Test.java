package org.p09;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem09Test {

    @Test
    @DisplayName("Should pack unique values")
    void pack() {
        List<String> list = List.of("'a", "'a", "'a", "'a", "'b", "'c", "'c", "'a", "'a", "'d", "'e", "'e", "'e", "'e");
        List<List<String>> expected = List.of(List.of("'a", "'a", "'a", "'a"), List.of("'b"), List.of("'c", "'c"), List.of("'a", "'a"), List.of("'d"), List.of("'e", "'e", "'e", "'e"));

        List<List<String>> result = Problem09.pack(list);

        assertArrayEquals(result.toArray(), expected.toArray());
    }
}