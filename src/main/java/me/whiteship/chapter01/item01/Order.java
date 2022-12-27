package me.whiteship.chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    public static Order primeOrder(Product product) {
        final Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        final Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
