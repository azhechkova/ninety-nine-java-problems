package org.p10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem10Test {

    @Test
    void encode() {
        List<String> list = List.of("'a", "'a", "'a", "'a", "'b", "'c", "'c", "'a", "'a", "'d", "'e", "'e", "'e", "'e");
        List<List<Object>> expected = List.of(List.of(4, "'a"), List.of(1, "'b"), List.of(2, "'c"), List.of(2, "'a"), List.of(1, "'d"), List.of(4, "'e"));

        List<List<Object>> result = Problem10.encode(list);

        assertArrayEquals(result.toArray(), expected.toArray());
    }
}