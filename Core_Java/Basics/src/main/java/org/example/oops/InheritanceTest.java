package org.example.oops;

import org.example.oops.model.Vehicle;
import org.example.oops.views.Bike;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Printable {
    void print(String message);
}

public class InheritanceTest {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {


        Function<String, Integer> example = String::length;

        Consumer<String> consumerExample = (s) -> System.out.println(s.length());

        consumerExample.accept("Hemanth");

        Supplier<LocalDateTime> supplierExample = LocalDateTime::now;

        System.out.println(supplierExample.get());

//        BiFunction<Integer, Integer, Integer> biFunctionForMethodReference = (a, b) -> InheritanceTest.addition(a,b);
        BiFunction<Integer, Integer, Integer> biFunctionForMethodReference = InheritanceTest::addition;
        System.out.println(biFunctionForMethodReference.apply(4, 5));

//        System.out.println(example.apply("Hemanth"));

        InheritanceTest inheritanceTestObj = new InheritanceTest();

//        Printable printable = (a) -> System.out.println(a);
//        Printable printable = System.out::println;
        Printable printable = (m) -> inheritanceTestObj.display(m);

//        Printable printableS =  (message) -> {
//            InheritanceTest inheritanceTest = new InheritanceTest();
//            inheritanceTest.display(message);
//        };
        Printable printableS =  inheritanceTestObj::display;

        printable.print("Hemanth Kumar");
//        Bike bike = new Bike();
//        bike.setHandle("Straight");
//        System.out.println(bike.getEngine());
    }

    static class PrintableImpl implements Printable {
        @Override
        public void print(String message) {
            InheritanceTest inheritanceTest = new InheritanceTest();
            inheritanceTest.display(message);
        }
    }

    static class SupplierExample implements java.util.function.Supplier<String> {

        @Override
        public String get() {
            return "";
        }
    }

    static class ExampleFunctionalInterFace implements Function<String, Integer> {
        @Override
        public Function andThen(Function after) {
            return Function.super.andThen(after);
        }

        @Override
        public Function compose(Function before) {
            return Function.super.compose(before);
        }

        @Override
        public Integer apply(String s) {
            return s.length();
        }
    }
}
