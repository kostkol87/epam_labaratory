package java8.lesson31_03_2016;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example01 {

    public static void main(String[] args) throws Exception {

        Callable<Integer> c = () -> 42;
        System.out.println(c.call());

        PrivilegedAction<Integer> c1 = () -> 42;
        System.out.println(c1.run());

        launch(c);
        launch(c1::run);
        launch(() -> 42);

        List<String> list = new ArrayList<>();

        Predicate<String> p1 = (s) -> list.add(s);
        Predicate<String> p2 = list::add;

        Consumer<String> c0 = list::add;

    }


    static void launch(Callable<?> callable){
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
