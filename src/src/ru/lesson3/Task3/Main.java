package src.ru.lesson3.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> a =(ArrayList<Integer>) new ListCreator().listCreator();
        System.out.println("Список                        " + a);
        System.out.println("Максимальное значение списка: " + new ListMax().listMax(a));
        System.out.println("Минимальное значение списка:  " + new ListMin().listMin(a));
        System.out.println("Среднее списка:               " + new ListAverage().listAverage(a));
    }
}
