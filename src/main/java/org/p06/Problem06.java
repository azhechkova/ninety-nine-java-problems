package org.p06;

import org.p04.Problem04;

import java.util.List;

public class Problem06 {
    public static <T> boolean palindrome(T[] list) {
        int size = Problem04.length(list);
        int lastIndex = size / 2;
        boolean result = false;

        for (int i = 0; i < lastIndex; i++) {
            T item = list[i];
            T mirrored = list[size - i - 1];

            if (!mirrored.equals(item)) {
                break;
            }

            if (i == lastIndex - 1) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static <T> boolean palindrome(List<T> list) {
        int size = Problem04.length(list);
        int lastIndex = size / 2;
        boolean result = false;

        for (int i = 0; i < lastIndex; i++) {
            T item = list.get(i);
            T mirrored = list.get(size - i - 1);

            if (!mirrored.equals(item)) {
                break;
            }

            if (i == lastIndex - 1) {
                result = true;
                break;
            }
        }

        return result;
    }
}
