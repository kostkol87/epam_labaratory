package java8.my.test;

import java.util.Arrays;
import java.util.List;

public class Main extends Test{
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java", "lambda", "testing"};
        List<String> strings = Arrays.asList(arr);
        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        strings.forEach(System.out::println);
    }
}
