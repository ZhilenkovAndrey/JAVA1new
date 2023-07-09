package src.ru.lesson3.Task2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ListCreation().listCrator();
        List<Integer> b = new EvenNumberDeleting().evenNumberDeleting(a);
        System.out.println("Обработанный список: " + b);
    }
}
