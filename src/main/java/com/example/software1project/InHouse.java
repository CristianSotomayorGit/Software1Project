package com.example.software1project;

public class InHouse extends Part {
    private int machineId;

    public InHouse(int id, String name, double price, int stock, int min, int max) {
        super(id, name, price, stock, min, max);
    }

    /**
     * @return the id
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * @param id the id to set
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

}
