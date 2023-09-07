package org.launchcode;
import java.util.ArrayList;

public abstract class BaseDisc {

    private String discType;
    private String name;
    private double storageCapacity;
    private double capacityUsed;
    private ArrayList<String> contents;

    public BaseDisc(String discType, String name, double storageCapacity, double capacityUsed, ArrayList<String> contents) {

        this.discType = discType;
        this.name  = name;
        this.storageCapacity = storageCapacity;
        this.capacityUsed = capacityUsed;
        this.contents = contents;
    }

    public double getRemainingStorageCapacity() {

        return storageCapacity - capacityUsed;

    }

    public String getDiscInfo() {

        return
            "Disc Type: " + getDiscType() + "\n"
            + "Disc Name: " + getName() + "\n"
            + "Disc Storage Capacity: " + (int)getStorageCapacity() + "\n"
            + "Disc Contents: " + getContents() + "\n";

    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(double capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    public String getContents() {
        return contents.toString();
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}
