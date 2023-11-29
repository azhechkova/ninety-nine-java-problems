package org.p05;

import java.util.List;

public class Problem05 {
    public static <T> List<T> reverse(List<T> list) {
        if (list.size() <= 1)
            throw new IllegalArgumentException("Illegal argument");

        return list.reversed();
    }
}
