package com.t1t.examples.propmanager;

// Datastructures
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiFloor extends Building {
    //Why didn't i take the blue pill
    private Map<Integer, List<Integer>> aptMatrix = new HashMap<>();

    public Map<Integer, List<Integer>> getAptMatrix() { return aptMatrix; }

    public void setAptMatrix(Map<Integer, List<Integer>> aptMatrix) { this.aptMatrix = aptMatrix; }

    public void setFloor(int floorNumber, List<Integer> apartments) {
        aptMatrix.put(floorNumber, apartments);
    }

    @Override
    public String toString() {
        String output =  "Amount of floors: " + aptMatrix.keySet().size() + "\n";
        for (Integer floor : aptMatrix.keySet()) {
            output += "Floor: "+floor+ " has " + aptMatrix.get(floor).size() + " apartments \n";
        }
        return output + super.toString();
    }
}
