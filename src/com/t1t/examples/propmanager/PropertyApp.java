package com.t1t.examples.propmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertyApp {
    public static void main(String[] args) throws Exception {
        new PropertyApp();
    }

    public PropertyApp() throws Exception {
        printPropertySummary();
    }

    private void printPropertySummary() throws Exception {
        // declaration of building list
        List<Building> buildings = new ArrayList<Building>();


        // 01 Retail example
        Building rs01 = new RetailStore();
        rs01.setConstructionYear(1992);
        buildings.add(rs01);


        // 02 Standalone example
        Building s01 = new Standalone();
        s01.setConstructionYear(2002);
        s01.setHasSecurity(true);
        GarageDescriptor s01garage = new GarageDescriptor(1,0);
        s01.setGarageDescriptor(s01garage);
        buildings.add(s01);

        // 03 Famous Hospital
        Building h01 = new Hospital();
        h01.setHasSecurity(true);
        h01.setConstructionYear(1990);
        GarageDescriptor h01garage = new GarageDescriptor(100,80);
        h01.setGarageDescriptor(h01garage);
        if (h01 instanceof Hospital) {
            ((Hospital) h01).setFloor(1, Arrays.asList(1, 2, 3));
            ((Hospital) h01).setFloor(2, Arrays.asList(1, 2, 3));
            ((Hospital) h01).setFloor(3, Arrays.asList(1, 2, 3));
            ((Hospital) h01).setFloor(4, Arrays.asList(1, 2, 3));
        }
        buildings.add(h01);

        // Summary output
        for (Building building : buildings) {
            System.out.println("-----------------------------");
            System.out.println(building);
            System.out.println("-----------------------------");
        }
    }
}
