package src.ru.lesson3.Task1;

public class Main {

    public static void main(String[] args) {

        int[] a = new Mass().massCreation();
        int[] b = new MassSort().sort(a);
        System.out.print("Отсортированный массив: ");
        new Mass().massPrint(b);
    }
}
