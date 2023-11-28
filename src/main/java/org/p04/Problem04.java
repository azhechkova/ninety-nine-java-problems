package org.p04;

import java.util.List;

public class Problem04 {
    public static <T> int length(List<T> list) {
        return list.size();
    }

    public static <T> int length(T[] list) {
        return list.length;
    }
}
