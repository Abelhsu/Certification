/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.ch4.lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 10405
 */
public class PuttingTogetherImpl {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted().limit(2)
                .forEach(System.out::println);

    }
}
