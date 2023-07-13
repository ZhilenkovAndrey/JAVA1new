package src.ru.lesson5.Task1;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> bookPhone = new ContactList().contactList();
        new PhoneBook().printBook(bookPhone);
    }
}
