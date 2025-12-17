package com.functionalInterface;

import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer> {
//
//    @Override
//    public void accept(Integer integer) {
//        System.out.println(integer);
//    }
//
//    public static void main(String[] args) {
//        Consumer<Integer> consumer = new ConsumerDemo();
//        consumer.accept(3);
//    }
//
//}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println(t);
        consumer.accept(2);

        Consumer<String> consumer2 = t -> System.out.println(t);
        consumer2.accept("Janardhan");
    }
}
