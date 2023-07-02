package ru.lesson1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    static BufferedReader reader;
    static int n;
    static int s;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число с которым нужно проводить операции: ");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Факториал числа равен: " + factorial(n));
        System.out.println("Сумма чисел от 1 до n равна: " + summa(n));
    }

    public static int factorial (int n){
        s = 1;
        IntStream.rangeClosed(1, n).forEachOrdered(i -> s = s * i);
        return s;
    }

    public static int summa (int n){
        s = 0;
        IntStream.rangeClosed(1, n).forEachOrdered(i -> s = s + i);
        return s;
    }
}
