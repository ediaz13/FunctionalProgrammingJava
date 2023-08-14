package com.basicsstrong.functional.section8;

public class HigherOrderFunctions {
    public static void main(String[] args) {

    }

    public static <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}
