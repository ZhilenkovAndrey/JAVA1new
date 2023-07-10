package src.ru.lesson4.Task1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ListCreator().listCreator();
        System.out.print("Исходный список:     ");
        new ListCreator().listPrint(a);
        new ListTuneOver().listTuneOver(a);
        System.out.print("Перевернутый список: ");
        new ListCreator().listPrint(a);
    }
}
