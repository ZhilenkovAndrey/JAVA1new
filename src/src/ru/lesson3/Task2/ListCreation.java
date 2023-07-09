package src.ru.lesson3.Task2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListCreation {

    public List<Integer> listCrator() {
        List<Integer> a = new Random().ints(0, 10).limit(7).boxed().collect(Collectors.toList());
        System.out.println("Исходный список:     " + a);
        return a;
    }
}
