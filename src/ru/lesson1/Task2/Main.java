package ru.lesson1.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.print("Все простые числа от 1 до 1000: ");
        nums();
    }

    public static void nums(){
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count < 2) System.out.print(i + ", ");
        }
    }
}
