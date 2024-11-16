package org.example.entity.drives;

public class NormalSportVehicleStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NormalSportVehicleStrategy");
    }
}
