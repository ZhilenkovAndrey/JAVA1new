package ru.lesson2.Task2;

import static java.util.stream.IntStream.*;

public class Mass {
    int temp;
    int count;
    int[] array;

    public int[] massCreation() {
        array = range(0, 10).map(i -> ((int) (Math.random() * 10))).toArray();
        System.out.print("Созданный масив: ");
        massPrint(array);
        return array;
    }

    public int[] massSort(int[] array) {
        while (true) {
            count = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
            if (count == 0) break;
        }
        System.out.print("Отсортированный массив: ");
        massPrint(array);
        return array;
    }

    public void massPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void start() {
        massSort(massCreation());
    }
}
