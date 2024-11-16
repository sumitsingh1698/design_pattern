package org.example.entity.vehicle;

import org.example.entity.drives.Sport650VehicleStrategy;

public class Sport600Bike extends  Vehicle {
    public Sport600Bike() {
        super(new Sport650VehicleStrategy());
    }
}
