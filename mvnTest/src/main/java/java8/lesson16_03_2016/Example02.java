package java8.lesson16_03_2016;

import java.util.Arrays;

public class Example02 {
    public static void main(String[] args) {

        String[] a = {"one", "two", "three", "four"};

        Arrays.asList(a).forEach(i -> System.out.println(i));

        Arrays.asList(a).forEach(System.out::println);
    }
}
