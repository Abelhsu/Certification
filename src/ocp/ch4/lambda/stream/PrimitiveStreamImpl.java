/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author 10405
 */
public class PrimitiveStreamImpl {

    public static void main(String[] args) {
        // Primitive
        System.out.println("【Primitive】");
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println("reduce(): " + stream.reduce(0, (s, n) -> s + n));
        // mapToInt()
        System.out.println("【mapToInt()】");
        stream = Stream.of(1, 2, 3);
        System.out.println("mapToInt(): " + stream.mapToInt(x -> x).sum());
        // IntStream (int, short, byte, char)
        System.out.println("【IntStream】");
        IntStream iStream = IntStream.iterate(1, x -> x + 1).limit(5);
        iStream.forEach(System.out::println);
        // IntStream (range, rangeClosed)
        IntStream iRange = IntStream.range(1, 6);
        iRange.forEach(System.out::println);
        IntStream iRangeClosed = IntStream.rangeClosed(1, 5);
        iRangeClosed.forEach(System.out::println);
        // IntStream (mapToInt)
        System.out.println("【IntStream (mapToInt)】");
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);

        // LongStream (long)
        System.out.println("【LongStream】");
        // DoubleStream (double, float)
        System.out.println("【DoubleStream】");
        DoubleStream empty = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        oneValue.forEach(System.out::println);
        varargs.forEach(System.out::println);
        // DoubleStream (generate(), iterate())
        System.out.println("【generate(), iterate()】");
        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(0.5, x -> x / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);
    }
}
