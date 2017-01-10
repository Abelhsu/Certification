/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.lambda;

import java.util.function.Supplier;

/**
 *
 * @author 10405
 */
public class SupplierSample {

    public static void main(String[] args) {
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();
        System.out.println("s1 = " + s1);
        System.out.println(s1.get());
        System.out.println("s2 = " + s2);
        System.out.println(s2.get());
    }
}
