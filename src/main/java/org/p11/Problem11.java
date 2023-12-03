package org.p11;

import org.p10.Problem10;

import java.util.List;
import java.util.stream.Collectors;

public class Problem11 {
    public static <T> List<Object> encodeModified(List<T> list) {
        List<List<Object>> encoded = Problem10.encode(list);

        return encoded.stream().map(v -> {
            if (v.get(0).equals(1)) {
                return v.get(1);
            }
            return v;
        }).collect(Collectors.toList());
    }
}
