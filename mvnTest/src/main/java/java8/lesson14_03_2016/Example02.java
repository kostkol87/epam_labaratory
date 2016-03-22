package java8.lesson14_03_2016;

import java.util.Arrays;
import java.util.Comparator;

public class Example02 {
    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four"};

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Arrays.sort(a, (s1, s2) -> s1.length() - s2.length());

        for (String line : a) {
            System.out.println(line);
        }
    }
}
