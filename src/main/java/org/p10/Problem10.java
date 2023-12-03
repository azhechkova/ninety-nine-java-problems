package org.p10;

import org.p09.Problem09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem10 {
    public static <T> List<List<Object>> encode(List<T> list) {
        List<List<T>> packed = Problem09.pack(list);

        return packed.stream().map((v) ->  List.of(v.size(), v.get(0))).collect(Collectors.toList());
    }
}
