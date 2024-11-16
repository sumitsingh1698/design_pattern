package org.example.entity.vehicle;

import org.example.entity.drives.NormalSportVehicleStrategy;

public class Sport400Bike extends  Vehicle {
    public Sport400Bike() {
        super(new NormalSportVehicleStrategy());
    }
}
