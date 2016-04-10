package java8.lesson05_04_2016;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Example01 {

    public static void main(String[] args) {

//        IntStream.iterate(0, i -> i = i + (i+1)).limit(10).forEachOrdered(System.out::println);

        Optional<Integer> max = Arrays.asList(1, 2, 3, 4, 5).stream().map(i -> i + 1).max(Integer::compareTo);

//        System.out.println(max);
//
        OptionalInt max2 = IntStream.rangeClosed(1, 5).map(i -> i + 1).max();

        System.out.println(max2);

//        Iterator<Integer> it =



    }

}
