package me.whiteship.chapter01.item01;

public class HelloServiceFactory {
    public static HelloService of(final String lang) {
        return ("ko".equals(lang)) ? new KoreanHelloService() : new EnglishHelloService();
    }
}
