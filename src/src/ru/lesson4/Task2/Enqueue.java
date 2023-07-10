package src.ru.lesson4.Task2;

import java.util.LinkedList;

public class Enqueue {
    public void enqueue(LinkedList<Object> a, Object o) {
        a.add(o);
        System.out.println("Элемент " + o.toString() + " помещен в конец списка.");
    }
}
