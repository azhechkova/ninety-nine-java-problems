package org.p12;

import java.util.ArrayList;
import java.util.List;

public class Problem12 {
    public static <T> List<T> decode(List<List<Object>> list) {
        List<T> result = new ArrayList<>();

        list.stream().forEach((i) -> {
            int amount = (int) i.get(0);
            Object item = i.get(1);
            for (int j = 0; j < amount; j++) {
                result.add((T) item);
            }
        });

        return result;
    }

}
