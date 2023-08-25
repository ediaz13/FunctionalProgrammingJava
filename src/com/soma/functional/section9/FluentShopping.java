package com.soma.functional.section9;

public class FluentShopping {
    public static void main(String[] args) {
        Order.place(order ->
                order.add("Shoes")
                        .add("Headphones")
                        .deliverAt("Libertad")
        );
    }
}
