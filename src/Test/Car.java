package Test;

import javax.swing.plaf.BorderUIResource;

public class Car {
    private String Engine ;
    private String Model ;
    private String Tires;
    private String Manufacturer;

    public Car(String engine, String model, String tires,String manufacturer) {
        this.Manufacturer=manufacturer;
        this.Engine = engine;
        this.Model = model;
        this.Tires = tires;
    }

    public String getManufacturer() { return Manufacturer; }

    public void setManufacturer(String manufacturer) { this.Manufacturer = manufacturer; }

    public String getEngine() { return Engine; }

    public void setEngine(String engine) { Engine = engine; }

    public String getModel() { return Model; }

    public void setModel(String model) { Model = model; }

    public String getTires() { return Tires; }

    public void setTires(String tires) { Tires = tires; }

    public String toString(){return "Car engine is:"+ Engine +  ",Model is:"+Model +  "Type of tires is:"+Tires + "Manufactured by :"+Manufacturer;}


}


