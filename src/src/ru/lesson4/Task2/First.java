package src.ru.lesson4.Task2;

import java.util.LinkedList;

public class First {
    public Object first(LinkedList<Object> a) {
        Object o = a.get(0);
        System.out.println("Первый элемент в списке: " + o.toString());
        return o;
    }
}
