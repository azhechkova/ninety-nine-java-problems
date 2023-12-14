package org.p12;

import org.junit.jupiter.api.Test;
import org.p10.Problem10;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem12Test {
    @Test
    void decode() {
        List<String> list = List.of("'a", "'a", "'a", "'a", "'b", "'c", "'c", "'a", "'a", "'d", "'e", "'e", "'e", "'e");
        List<List<Object>> encoded = Problem10.encode(list);

        List<String> result = Problem12.decode(encoded);
        assertArrayEquals(list.toArray(), result.toArray());
    }
}