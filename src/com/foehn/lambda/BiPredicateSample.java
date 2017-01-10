/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.lambda;

import java.util.function.BiPredicate;

/**
 *
 * @author 10405
 */
public class BiPredicateSample {

    public static void main(String[] args) {
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chick", "chick"));
    }
}
