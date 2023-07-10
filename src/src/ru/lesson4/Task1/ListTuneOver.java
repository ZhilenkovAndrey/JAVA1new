package src.ru.lesson4.Task1;

import java.util.Collections;
import java.util.LinkedList;

public class ListTuneOver {
    public LinkedList<Integer> listTuneOver(LinkedList<Integer> a) {
        Collections.reverse(a);
        return new LinkedList<>(a);
    }
}
