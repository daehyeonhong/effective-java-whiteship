package me.whiteship.chapter01.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {

    static String hello() {
        return "hello";
    }

    String valueOf(Integer integer);
}
