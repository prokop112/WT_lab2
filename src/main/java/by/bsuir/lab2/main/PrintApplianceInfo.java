package main.java.by.bsuir.lab2.main;

import main.java.by.bsuir.lab2.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliances) {
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}
