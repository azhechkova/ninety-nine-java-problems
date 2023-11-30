package org.p08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem08 {
    public static <T> List<T> compress(List<T> list) {
        Set<T> set = new HashSet<>(list);

        return set.stream().toList();
    }
}
