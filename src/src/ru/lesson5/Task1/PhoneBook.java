package src.ru.lesson5.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public void addNumber(String key, int value, Map<String, List<Integer>> map){
        if (map.containsKey(key)) map.get(key).add(value);
         else {
            List<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public void printBook(Map<String, List<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
