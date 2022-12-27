package me.whiteship.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        final ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        final Optional<HelloService> first = loader.findFirst();
        first.ifPresent(h -> System.out.println(h.hello()));
    }
}
