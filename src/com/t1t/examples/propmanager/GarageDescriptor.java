package com.t1t.examples.propmanager;

public class GarageDescriptor {
    private int total;
    private int available;

    public GarageDescriptor(int total, int available) {
        this.total = total;
        this.available = available;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Garage with total of " + this.total + " spaces, where " + this.available + " are available.";
    }
}
