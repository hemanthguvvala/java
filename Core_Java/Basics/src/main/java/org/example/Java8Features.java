package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) {

        String name = "Hemanth";

        Optional<String> optionalWithoutOf = Optional.empty();
        System.out.println(optionalWithoutOf);

        Optional<String> optionalWithOf = Optional.of(name);
        System.out.println(optionalWithOf);

        List<String> data = null;
        var steam = Stream.ofNullable(data);

        steam.forEach(System.out::println);

        var data2 = new ArrayList<>();
        data2.add("abc");
        data2.add("baca");
        Stream<Object> steam2 = Stream.ofNullable(data2);

        steam2.forEach(System.out::println);
    }
}
