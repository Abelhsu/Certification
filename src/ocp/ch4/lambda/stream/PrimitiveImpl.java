/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.stream.Stream;

/**
 *
 * @author 10405
 */
public class PrimitiveImpl {

    public static void main(String[] args) {
        // Primitive
        System.out.println("【Primitive】");
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println("reduce(): " + stream.reduce(0, (s, n) -> s + n));
        stream = Stream.of(1, 2, 3);
        System.out.println("mapToInt(): "+stream.mapToInt(x -> x).sum());
    }
}
