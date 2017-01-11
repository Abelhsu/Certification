/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author 10405
 */
public class TerminalOperationImpl {

    public static void main(String[] args) {
        // count(), min(), max()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());
        s = Stream.of("monkey", "gorilla", "bonobo");
        s.forEach(System.out::println);
        s = Stream.of("monkey", "gorilla", "ape");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);
    }
}
