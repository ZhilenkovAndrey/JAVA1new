package src.ru.lesson6.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;
import java.util.Set;

public class LaptopSelection {
    private BufferedReader bufferedreader;
    private int count;
    private String model;
    private String ram;
    private String hdd;
    private String operationSystem;
    private String colour;
    private String characteristic;
    private String characteristic1;
    List<String> characteristics = new Laptop().characteristics();

    public void characteristicSelection(Set<Laptop> laptops) {
        bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите параметры для подбора ноутбука: ");

        while (true) {
            System.out.println(characteristics);

            try {
                characteristic = bufferedreader.readLine();
                bufferedreader.close();
            } catch (IOException e) {
                System.out.println("Неверный ввод, попробуйте снова");
            }

            if (characteristics.stream().anyMatch(x -> x.equalsIgnoreCase(characteristic))) {
                System.out.println("вы вбрали: " + characteristic);
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова");
            }
        }
    }

    public void ValueOfCharacteristicSelection(String characteristic, Set<Laptop> laptops) {
        bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        count = 0;
        System.out.println("Введлите параметры " + characteristic + ": ");

        try {
            characteristic1 = bufferedreader.readLine();
            bufferedreader.close();
        } catch (IOException e) {
            System.out.println("Неверный ввод, попробуйте снова");
        }

        for (Character c : characteristic1.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count == characteristic1.toCharArray().length) {
            int value = Integer.parseInt(characteristic1);
        }

        if (count == 0){
            String value = characteristic1;
        }

        else {

        }
    }

}
