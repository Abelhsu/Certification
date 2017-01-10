/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.buildin;

import java.util.function.UnaryOperator;

/**
 *
 * @author 10405
 */
public class UnaryOperatorImpl {

    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("foehn"));
        System.out.println(u2.apply("abel"));
    }
}
