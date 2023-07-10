package src.ru.lesson4.Task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListCreator {

    public LinkedList<Object> listCreator() {
        List<Object> a = new Random()
                .ints(0, 10)
                .distinct()
                .limit(7)
                .boxed()
                .collect(Collectors.toList());

        return new LinkedList<>(a);
    }

    public void listPrinter(List<Object> a) {
        a.stream()
                .flatMap(l -> Stream.of(", ", l))
                .skip(1)
                .forEach(System.out::print);
        System.out.println();
    }
}
