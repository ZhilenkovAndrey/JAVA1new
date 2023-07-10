package src.ru.lesson4.Task2;

import java.util.LinkedList;

public class Dequeue {
    public Object dequeue(LinkedList<Object> a) {
        Object o = a.get(0);
        System.out.println("Первый элемент списка: " + o.toString() + " - удален.");
        a.remove(0);
        return o;
    }
}
