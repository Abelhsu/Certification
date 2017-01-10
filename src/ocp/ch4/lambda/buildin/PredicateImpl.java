/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.buildin;

import java.util.function.Predicate;

/**
 *
 * @author 10405
 */
public class PredicateImpl {

    public static void main(String[] args) {
        // test()
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("..."));
        System.out.println(p2.test(""));
        
        // Default method
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());
        System.out.println(egg.test("brown"));
        System.out.println(brown.test("brown"));
        System.out.println(brownEggs.test("brownegg"));
        System.out.println(otherEggs.test("brown"));
    }
}
