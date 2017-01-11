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
public class IntermediateOperationImpl {

    public static void main(String[] args) {
        // filter()
        System.out.println("【filter()】");
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo", "makaka");
        stream.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }
}
