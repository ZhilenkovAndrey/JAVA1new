package src.ru.lesson6.Task1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Laptop> laptops = new LinkedHashSet<>();
        laptops.add(new Laptop("HP", 8, 500, "Win10", "black"));
        laptops.add(new Laptop("Asus", 16, 700, "Linux", "black"));
        laptops.add(new Laptop("Lenovo", 12, 600, "Win10", "black"));
        laptops.add(new Laptop("Acer", 8, 1500, "Win10", "white"));
        laptops.add(new Laptop("HP", 6, 900, "Linux", "grey"));


        new LaptopSelection().characteristicSelection(laptops);
    }
}
