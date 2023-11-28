package org.p03;

import java.util.List;
import java.util.NoSuchElementException;

public class Problem03 {
    public static <T> T nth(int index, List<T> list) throws NoSuchElementException {
        if (list.size() < index + 1) {
            throw new NoSuchElementException("No such element");
        }

        return list.get(index);
    }

    public static <T> T nth(int index, T[] list) {
        if (list.length < index + 1) {
            throw new NoSuchElementException("No such element");
        }

        return list[index];
    }
}
