/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author 10405
 */
public class CreateStreamImpl {

    public static void main(String[] args) {
        // Create finite stream
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        // Create stream from list
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
        // Create infinite stream
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        randoms.limit(10).forEach(System.out::println);
        oddNumbers.limit(10).forEach(System.out::println);
    }
}
