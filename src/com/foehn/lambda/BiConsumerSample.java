/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *
 * @author 10405
 */
public class BiConsumerSample {

    public static void main(String[] args) {
        // Sample 1
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("Chicken", 7);
        b2.accept("Chick", 1);
        System.out.println(map);
        // Sample 2
        Map<String, String> map2 = new HashMap<>();
        BiConsumer<String, String> b3 = map2::put;
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);
        b3.accept("Chicken", "Cluck");
        b4.accept("chick", "Tweep");
        System.out.println(map2);
    }
}
