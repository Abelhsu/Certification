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
public class IntermediateOperationImpl {

    public static void main(String[] args) {
        // filter()
        System.out.println("【filter()】");
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo", "makaka");
        stream.filter(x -> x.startsWith("m")).forEach(System.out::println);
        // distinct()
        System.out.println("【distinct()】");
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::println);
        // limit(), skip()
        System.out.println("【limit(), skip()】");
        Stream<Integer> itStream = Stream.iterate(1, n -> n + 1);
        itStream.skip(5).limit(2).forEach(System.out::println);
        // map() Turn String type into Integer
        System.out.println("【map()】");
        Stream<String> ss = Stream.of("monkey", "gorilla", "bonobo", "ape", "chimpanzee", "makaka");
        ss.map(String::length).forEach(System.out::println);
        // flatMap()
        System.out.println("【flatMap()】");
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(two, zero, one);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
