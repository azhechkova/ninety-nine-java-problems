package org.p07;

import java.util.List;
import java.util.stream.Collectors;

public class Problem07 {
    public static <T> List<T> flatten(List<List<T>> list) {
        return list.stream().flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
