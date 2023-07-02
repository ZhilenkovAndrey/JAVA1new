package ru.lesson2.Task1;

import java.util.HashMap;
import java.util.Map;

public class JsonString {
    Map<String, String> params;
    StringBuilder sb;

    public Map<String, String> makeString() {
        params = new HashMap<>();

        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);

        return params;
    }

    public void printJsonString(Map<String, String> params) {
        System.out.println("JSON: ");
        for (Map.Entry<String, String> item : params.entrySet()) {
            System.out.printf(" %s  %s \n", item.getKey(), item.getValue());
        }
    }

    public StringBuilder makeStringBuilder(Map<String, String> params) {
        sb = new StringBuilder();

        for (Map.Entry<String, String> p : params.entrySet()) {
            if (p.getValue() != null) sb.append(p.getKey() + " = " + p.getValue() + "; ");
        }
        return sb;
    }

    public void printStringBuilder(StringBuilder sb) {
        System.out.println("StrinBuilder: ");
        System.out.println(sb.toString());
    }
}
