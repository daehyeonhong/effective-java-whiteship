package me.whiteship.chapter01.item01;

public interface HelloService {

    static String hi() {
        prepareMessage();
        return "hi";
    }

    static private void prepareMessage() {
    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }

    String hello();

    default String bye() {
        return "bye";
    }
}
