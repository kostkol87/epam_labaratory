package java8.lesson29_03_2016;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Example01 {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("a", "b", "A", "B");
        strList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        //Unbound reference
        strList.sort(String::compareToIgnoreCase);
        //book: Java 8 in action

        Map<String, String> map = new TreeMap<String, String>(){{
            put("alpha", "x");
            put("bravo", "y");
            put("charlie", "z");
        }};

        String str = "apha-bravo-charlie";
//        map.replaceAll(str::replace);
//        System.out.println(map.toString());
        map.replaceAll(String::concat);
        System.out.println(map.toString());
    }
}
