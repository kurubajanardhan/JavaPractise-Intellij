package com.functionalInterface;

import java.util.function.Function;

//public class FunctionDemo implements Function<String,String> {
//    @Override
//    public String apply(String s) {
//        return "Hello";
//    }
//
//    public static void main(String[] args) {
//        Function<String,String> function = new FunctionDemo();
//        System.out.println(function.apply("Hi"));
//    }
//}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,String> function = s -> "Hi";
        System.out.println(function.apply("Hello"));
    }
}