package src.ru.lesson3.Task1;

import static java.util.stream.IntStream.range;

public class Mass {

    int[] array;

    public int[] massCreation() {
        array = range(0, 10).map(i -> ((int) (Math.random() * 10))).toArray();
        System.out.print("Созданный масив:        ");
        massPrint(array);
        return array;
    }

    public void massPrint(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}
