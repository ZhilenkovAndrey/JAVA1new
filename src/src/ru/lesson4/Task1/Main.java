package src.ru.lesson4.Task1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> a = new ListCreator().listCreator();
        System.out.print("Исходный список:     ");
        new ListCreator().listPrint(a);
        new ListTuneOver().listTuneOver(a);
        System.out.print("Перевернутый список: ");
        new ListCreator().listPrint(a);
    }
}
