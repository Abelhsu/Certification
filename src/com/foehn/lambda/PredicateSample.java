/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.lambda;

import java.util.function.Predicate;

/**
 *
 * @author 10405
 */
public class PredicateSample {

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("..."));
        System.out.println(p2.test(""));
    }
}
