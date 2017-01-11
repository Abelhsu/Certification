/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.extra;

import java.util.Optional;

/**
 *
 * @author 10405
 */
public class OptionalImpl {

    public static void main(String[] args) {
        Optional<Double> value = average(18, 20, 30, 40, 100);
        System.out.println("value = " + value.get());
        // ifPresent()
        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println);
        System.out.println("Average= " + opt.get());
        // orElse(), orElseGet(), orElseThrow()
        opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        } else {
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            return Optional.of((double) sum / scores.length);
        }
    }
}
