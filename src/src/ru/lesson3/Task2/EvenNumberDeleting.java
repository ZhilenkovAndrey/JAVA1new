package src.ru.lesson3.Task2;

import java.util.List;

public class EvenNumberDeleting {
    public List<Integer> evenNumberDeleting(List<Integer> a) {
        a.removeIf(n -> n % 2 == 0);
        return a;
    }
}
