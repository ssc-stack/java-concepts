package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    static List<Integer> getOdd(Stream<Integer> stream){
        // write code here
        List<Integer> res=stream.filter((el)->el%2!=0).collect(Collectors.toList());
        return res;
    }
}
