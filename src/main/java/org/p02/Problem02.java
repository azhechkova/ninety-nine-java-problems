package org.p02;

import java.util.List;
import java.util.NoSuchElementException;

public class Problem02 {
    public static <T> T penultimate(T[] list) throws NoSuchElementException {
        if (list.length <= 1) {
            throw new NoSuchElementException("No such element");
        }

        return list[list.length - 2];
    }

    public static <T> T penultimate(List<T> list) throws NoSuchElementException  {
        if (list.size() <= 1) {
            throw new NoSuchElementException("No such element");
        }

        return list.get(list.size() - 2);
    }
}
