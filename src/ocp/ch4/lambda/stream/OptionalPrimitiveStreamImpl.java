/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 *
 * @author 10405
 */
public class OptionalPrimitiveStreamImpl {

    public static void main(String[] args) {
        // OptionalDouble
        System.out.println("【OptionalDouble】");
        IntStream intStream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = intStream.average();
        optional.ifPresent(System.out::println);
    }
}
