package org.p01;

import java.util.List;
import java.util.NoSuchElementException;

public class Problem01 {
    public static <T> T last(T[] list) throws NoSuchElementException {
        if (list.length == 0) {
            throw new NoSuchElementException("No such element");
        }

        return list[list.length - 1];
    }

    public static <T> T last(List<T> list) throws NoSuchElementException  {
        if (list.isEmpty()) {
            throw new NoSuchElementException("No such element");
        }

        return list.getLast();
    }
}
