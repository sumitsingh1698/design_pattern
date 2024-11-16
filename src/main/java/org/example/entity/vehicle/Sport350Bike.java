package org.example.entity.vehicle;

import org.example.entity.drives.NormalSportVehicleStrategy;

public class Sport350Bike extends  Vehicle {
    public Sport350Bike() {
        super(new NormalSportVehicleStrategy());
    }
}
