package org.p11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11Test {

    @Test
    void encodeModified() {
        List<String> list = List.of("'a", "'a", "'a", "'a", "'b", "'c", "'c", "'a", "'a", "'d", "'e", "'e", "'e", "'e");
        List<Object> expected = List.of(List.of(4, "'a"), "'b", List.of(2, "'c"), List.of(2, "'a"), "'d", List.of(4, "'e"));

        List<Object> result = Problem11.encodeModified(list);

        assertArrayEquals(result.toArray(), expected.toArray());

    }
}