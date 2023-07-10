package src.ru.lesson4.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Start {

    BufferedReader reader;
    int x;
    Object o;

    public void start (LinkedList<Object> a){
        while(true) {
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Поместить элемент в конец очереди - 1");
            System.out.println("Вернуть первый элемент из очереди и удалить его - 2");
            System.out.println("Вернуть первый элемент из очереди - 3");
            System.out.print("Введите операцию над списком: ");

            try {
                x = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Такого варианта выбора нет.");
                System.out.println();
            }

            if (x < 1 ||x > 3) System.out.println("Такого варианта выбора нет.");
            System.out.println();

            if (x >= 1 & x <= 3) break;
        }

        if (x == 1) {
            System.out.println("Введите элемент, кторый нужно поместить в конец очереди: ");
            try {
                o = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            new Enqueue().enqueue(a, o);
        }

        if (x == 2) new Dequeue().dequeue(a);

        if (x == 3) new First().first(a);
    }
}
