package src.ru.lesson4.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calk {

    BufferedReader reader;
    public void summ(double a, double b){
        System.out.println("Сумма чисел равна: " + (a + b));
    }

    public void multiplication(double a, double b){
        System.out.println("Производное чисел равно: " + (a * b));
    }

    public void division(double a, double b){
        System.out.println("Деление чисел равно: " + (a / b));
    }

    public void difference(double a, double b){
        System.out.println("Разница чисел равна: " + (a - b));
    }

    public void start() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите знак операции (+, -, *, /): ");
        String sign = reader.readLine();

        calc(a, b, sign);
    }

    public void calc(double a, double b, String sign){
        if (sign.equals("+")) summ(a, b);
        if (sign.equals("-")) difference(a, b);
        if (sign.equals("*")) multiplication(a, b);
        if (sign.equals("/")) division(a, b);
    }
}
