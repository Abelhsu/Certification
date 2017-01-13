/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.Optional;

/**
 *
 * @author 10405
 */
public class ChainingOptionalImpl {

    public static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(30);
        threeDigit(optional);
    }
}
