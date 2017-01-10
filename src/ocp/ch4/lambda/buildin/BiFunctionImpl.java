/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.buildin;

import java.util.function.BiFunction;

/**
 *
 * @author 10405
 */
public class BiFunctionImpl {

    public static void main(String[] args) {
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("chicken", " cluck"));
        System.out.println(b2.apply("chick", " tweep"));
    }
}
