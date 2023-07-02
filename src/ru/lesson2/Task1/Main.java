package ru.lesson2.Task1;

public class Main {
    public static void main(String[] args) {
        new JsonString().printJsonString(new JsonString().makeString());
        new JsonString().printStringBuilder(new JsonString().makeStringBuilder(new JsonString().makeString()));
    }
}
