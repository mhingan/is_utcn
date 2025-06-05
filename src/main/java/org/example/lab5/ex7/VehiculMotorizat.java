package org.example.lab5.ex7;

public class VehiculMotorizat extends Vehicul {

    GeoLoc location;

    public VehiculMotorizat(String culoare, double vitezaMaximaDeDeplasare, int nrMaximPasageri, GeoLoc location) {
        super(culoare, vitezaMaximaDeDeplasare, nrMaximPasageri);
        this.location = location;
    }

    public GeoLoc getLocation() {
        return location;
    }

    public void setLocation(GeoLoc location) {
        this.location = location;
    }

    public void deplasare(){
        System.out.println("Deplasare vehicul");

    }
}
