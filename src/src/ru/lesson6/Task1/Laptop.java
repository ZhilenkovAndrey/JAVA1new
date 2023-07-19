package src.ru.lesson6.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Getter
//@Setter
//@AllArgsConstructor
//@ToString

public class Laptop {
    private String model;
    private int ram;
    private int hdd;
    private String operationSystem;
    private String colour;

    public Laptop(String model, int ram, int hdd, String operationSystem, String colour) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.operationSystem = operationSystem;
        this.colour = colour;
    }

    public Laptop() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColour() {
        return colour;
    }

    public List<String> characteristics() {
        List<String> characteristics = new ArrayList<>(Arrays.asList
                ("RAM", "HDD", "OperationSystem", "Colour", "Model"));
        return characteristics;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + model + "): " +
                "количество опретивной памяти:" + ram +
                ", операционная система: " + operationSystem +
                ", цвет: " + colour +
                ", жесткий диск: " + hdd;
    }
}
