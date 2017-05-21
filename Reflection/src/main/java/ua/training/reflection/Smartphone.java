package ua.training.reflection;

import javax.annotation.Resource;

/**
 * Created by allugard on 21.05.17.
 */
@Deprecated
public class Smartphone extends Phone implements InternetAccessable {
    private int processorCores;
    @Deprecated
    private double processorFrequency;
    private int ram;

    public Smartphone(String name, double weight, int internalMemory, boolean camera, int processorCores, double processorFrequency, int ram) {
        super(name, weight, internalMemory, camera);
        this.processorCores = processorCores;
        this.processorFrequency = processorFrequency;
        this.ram = ram;
    }

    public Smartphone() {
    }

    @CallMe
    public void goOnline() {
        System.out.println("You online");
    }

    public int getProcessorCores() {
        return processorCores;
    }

    public void setProcessorCores(int processorCores) {
        this.processorCores = processorCores;
    }

    public double getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(double processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "processorCores=" + processorCores +
                ", processorFrequency=" + processorFrequency +
                ", ram=" + ram +
                '}';
    }
}
