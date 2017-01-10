/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.lambda;

import java.util.function.Consumer;

/**
 *
 * @author 10405
 */
public class CustomerSample {

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;
        c1.accept("Abel");
        c2.accept("Foehn");
    }
}
