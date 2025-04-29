package org.example.oops.views;

import org.example.oops.model.Vehicle;

public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }
}
