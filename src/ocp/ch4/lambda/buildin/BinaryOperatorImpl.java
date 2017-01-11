/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.buildin;

import java.util.function.BinaryOperator;

/**
 *
 * @author 10405
 */
public class BinaryOperatorImpl {

    public static void main(String[] args) {
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("Abel ", "Hsu"));
        System.out.println(b2.apply("Foehn ", "Hsu"));
    }
}
