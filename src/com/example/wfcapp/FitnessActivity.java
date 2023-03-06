package com.example.wfcapp;

public class FitnessActivity {
    private String type, session;
    private double price;
    private int availableSlots;

    public FitnessActivity (String type, String session, double price, int availableSlots) {
        this.type = type;
        this.session = session;
        this.price = price;
        this.availableSlots = availableSlots;
    }


}
