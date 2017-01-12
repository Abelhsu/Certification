/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
        System.out.println("optional = " + optional.getAsDouble());
        System.out.println("optional = " + optional.orElseGet(() -> Double.NaN));
        // Optional type primitive
        System.out.println("【Optional type primitive】");
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println("sum = " + sum);
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.limit(10).min();
        System.out.println("min = " + min.getAsDouble());
    }

    // Statistic summary (orElseThrow())
    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    // Statistic summary (IntSummaryStatistics, getMax(), getMin())
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new RuntimeException();
        }
        return stats.getMax() - stats.getMin();
    }
}
