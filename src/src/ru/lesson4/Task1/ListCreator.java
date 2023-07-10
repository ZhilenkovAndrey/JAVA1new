package src.ru.lesson4.Task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListCreator {

    public List<Integer> listCreator() {
        return new Random()
                .ints(0, 10)
                .distinct()
                .limit(7)
                .boxed()
                .collect(Collectors.toList());
    }

    public void listPrint(List<Integer> a) {
        a.forEach(System.out::print);
        System.out.println();
    }
}
