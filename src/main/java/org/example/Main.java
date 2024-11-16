package org.example;

import org.example.entity.vehicle.Sport350Bike;
import org.example.entity.vehicle.Sport400Bike;
import org.example.entity.vehicle.Sport600Bike;
import org.example.entity.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started...");
        Vehicle sport600Bike = new Sport600Bike();
        Vehicle sport400Bike = new Sport400Bike();
        Vehicle sport350Bike = new Sport350Bike();


        sport400Bike.drive();
        sport600Bike.drive();
        sport350Bike.drive();
    }
}