package org.example;

import java.util.Optional;

public class Java8Features {
    public static void main(String[] args) {

        String name = "Hemanth";

        Optional<String> optionalWithoutOf = Optional.empty();
        System.out.println(optionalWithoutOf);

        Optional<String> optionalWithOf = Optional.of(name);
        System.out.println(optionalWithOf);
    }
}
