package java8.lesson16_03_2016;

import java.util.Arrays;
import java.util.Comparator;

public class Task01 {
    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four"};
//        Arrays.sort(a, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        });

//        Arrays.sort(a, (s1, s2) -> s1.length() - s2.length());

//        compare by length - revese
//        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());

//compare by second letter
        Arrays.sort(a, (s1, s2) -> s1.charAt(1)-(s2.charAt(1)));

//compare by second letter that start with "t"
        Arrays.sort(a, (s1, s2) -> s1.charAt(1)-(s2.charAt(1)));
        String test = "asdasd";
        System.out.println(Arrays.toString(a));
        }
    }

