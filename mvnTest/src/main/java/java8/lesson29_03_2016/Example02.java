package java8.lesson29_03_2016;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example02 {
    static class A{
        A(int a){

        }
        A(){}

        A(int a, int b){

        }
    }

    interface MySup <T>{
        T createMyIncredableObjects();
    }

    public static void main(String[] args) {
        Supplier<A> a = A::new;
        MySup<A> a1= A::new;
        A a2 = a1.createMyIncredableObjects();
        System.out.println(a2);

//        interface Function<T, R>
        Function<Integer, A> f = A::new;
        A a3 = f.apply(10);
//        interface BiFunction<T, U, R>
        BiFunction<Integer, Integer, A> biF = A::new;
    }
}

