package com.functionalInterface;

import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//
//    @Override
//    public String get() {
//        return "Janardhan";
//    }
//
//    public static void main(String[] args) {
//
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());
//    }
//}

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "jana";
        System.out.println(supplier.get());
    }
}
