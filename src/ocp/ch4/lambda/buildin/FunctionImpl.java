/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.buildin;

import java.util.function.Function;

/**
 *
 * @author 10405
 */
public class FunctionImpl {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = (s) -> s.length();
        System.out.println("f1 = " + f1.apply("cluck"));
        System.out.println("f2 = " + f2.apply("cluck"));
    }
}
