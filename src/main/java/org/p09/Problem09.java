package org.p09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem09 {
    public static <T> List<List<T>> pack(List<T> list) {
        List<List<T>> result = new ArrayList<>();

        Iterator<T> iterator = list.iterator();

        T value = iterator.next();
        List<T> tempArr = new ArrayList<>();
        tempArr.add(value);

        while (iterator.hasNext()) {
            T currValue = iterator.next();

            if (value.equals(currValue)) {
                tempArr.add(currValue);
            } else {
                result.add(tempArr);
                tempArr = new ArrayList<>();
                tempArr.add(currValue);
            }

            value = currValue;
        }

        result.add(tempArr);

        return result;
    }
}
