package ua.training.reflection;

/**
 * Created by allugard on 21.05.17.
 */
public abstract class Phone {
    protected String name;
    protected double weight;
    protected int internalMemory;
    protected boolean camera;

    public Phone(String name, double weight, int internalMemory, boolean camera) {
        this.name = name;
        this.weight = weight;
        this.internalMemory = internalMemory;
        this.camera = camera;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(int internalMemory) {
        this.internalMemory = internalMemory;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
}
