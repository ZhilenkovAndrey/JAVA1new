package src.ru.lesson5.Task1;

import java.util.*;

public class ContactList {
    public Map<String, List<Integer>> contactList() {
        Map<String, List<Integer>> bookPhone = new LinkedHashMap<>();
        new PhoneBook().addNumber("Ivanov", 12345678, bookPhone);
        new PhoneBook().addNumber("Ivanov", 12348767, bookPhone);
        new PhoneBook().addNumber("Petrov", 54658576, bookPhone);
        new PhoneBook().addNumber("Sidorov", 89564776, bookPhone);
        new PhoneBook().addNumber("Ivanov", 12356233, bookPhone);
        new PhoneBook().addNumber("Petrov", 78789767, bookPhone);

        listSort(bookPhone);
        return bookPhone;
    }

    public Map<String, List<Integer>> listSort (Map<String, List<Integer>> bookPhone) {
        bookPhone.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(List::size)))
                .forEachOrdered(x -> bookPhone.put(x.getKey(), x.getValue()));

        return bookPhone;
    }
}
