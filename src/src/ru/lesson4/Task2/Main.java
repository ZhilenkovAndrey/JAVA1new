package src.ru.lesson4.Task2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Object> a = new ListCreator().listCreator();
        System.out.print("Созданный список: ");
        new ListCreator().listPrinter(a);

        new Start().start(a);

        System.out.print("Обновленный список: ");
        new ListCreator().listPrinter(a);
    }
}
