package com.t1t.examples.arrays;

public class TestApplication {

    public static void main (String[]args){
        double[] coords={5.0 , 0.0, 3.0};
        ArrayLocation accra=new ArrayLocation(coords);
        coords[0]=32.9 ;
        coords[1]=-117.2;
        for (double coord : coords) {
            System.out.println(coord);
        }
/*        System.out.println(coords[0]);
        System.out.println(coords[2]);
        System.out.println(coords[3]);*/
    }
}