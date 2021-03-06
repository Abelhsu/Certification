/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationImpl {

    public static void main(String[] args) {
        // count(), min(), max()
        System.out.println("【count(), min(), max()】");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());
        s = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);
        // findAny(), findFirst()
        System.out.println("【findAny(), findFirst()】");
        s = Stream.of("monkey", "gorilla", "ape", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
        // allMatch(), anyMatch(), noneMatch()
        System.out.println("【allMatch(), anyMatch(), noneMatch()】");
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite.anyMatch(pred));
        // forEach()
        System.out.println("【forEach()】");
        s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::println);
        // reduce()
        System.out.println("【reduce()】");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s1, s2) -> s1 + s2);
        System.out.println(word);
        stream = Stream.of("F", "o", "e", "h", "n");
        word = stream.reduce("", String::concat);
        System.out.println(word);
        Stream<Integer> multiply = Stream.of(3, 5, 6, 10);
        System.out.println(multiply.reduce(1, (a, b) -> a * b));
        BinaryOperator<Integer> op = (a, b) -> a * b;
        multiply = Stream.of(3, 5, 6);
        System.out.println(multiply.reduce(1, op, op));
        // collect() same accumulator, combiner
        System.out.println("【collect()】");
        stream = Stream.of("w", "o", "l", "f");
        StringBuilder sb = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("sb = " + sb);
        // collect() different accumulator, combiner
        System.out.println("【accumulator, combiner】");
        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);
        //
        stream = Stream.of("w", "o", "l", "f");
        set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
        //
        stream = Stream.of("w", "o", "l", "f");
        Set<String> iset = stream.collect(Collectors.toSet());
        System.out.println(iset);
    }
}
