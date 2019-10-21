package com.t1t.examples.propmanager;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

abstract class Building {
    private int constructionYear; //check application if it's a valid year -> 'yyyy'
    private boolean hasSecurity;
    private GarageDescriptor garageDescriptor;

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) throws Exception {
        if(String.valueOf(constructionYear).length() == 4 && constructionYear > 1900 && constructionYear < 2019) this.constructionYear = constructionYear;
        else throw new Exception("Malkas eimai pou tha valo auto to consturctionyear");
    }

    public boolean isHasSecurity() {
        return hasSecurity;
    }

    public void setHasSecurity(boolean hasSecurity) {
        this.hasSecurity = hasSecurity;
    }

    public GarageDescriptor getGarageDescriptor() {
        return garageDescriptor;
    }

    public void setGarageDescriptor(GarageDescriptor garageDescriptor) {
        this.garageDescriptor = garageDescriptor;
    }

    @Override
    public String toString() {
        String output = "Construction year: " + this.constructionYear +"\n";
        // output = ouput + " "
        output += "Has security: " + this.hasSecurity+"\n";
        output += "Garage summary: " + ((this.garageDescriptor==null)? "No garage": this.garageDescriptor) +"\n";
        return output;
    }
}
