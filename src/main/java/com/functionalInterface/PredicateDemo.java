package com.functionalInterface;

import java.util.function.Predicate;

//public class com.functionalInterface.PredicateDemo implements Predicate<Integer> {
//
//    @Override
//    public boolean test(Integer integer) {
//        return integer % 2 == 0;
//    }
//
//    public static void main(String[] args) {
//
//        Predicate<Integer> predicate = new com.functionalInterface.PredicateDemo();
//        System.out.println(predicate.test(4));
//    }
//
//}

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(5));
    }
}
