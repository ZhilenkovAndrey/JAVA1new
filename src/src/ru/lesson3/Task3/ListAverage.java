package src.ru.lesson3.Task3;

import java.util.ArrayList;

public class ListAverage {

    public double listAverage(ArrayList<Integer> a) {
        return a.stream().mapToInt(n -> n).average().orElse(0);
    }
}
