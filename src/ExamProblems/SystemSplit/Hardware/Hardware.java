package ExamProblems.SystemSplit.Hardware;

import ExamProblems.SystemSplit.Software.Software;
import ExamProblems.SystemSplit.Systems;

import java.util.LinkedHashMap;

public abstract class Hardware extends Systems{
    private int maxCapacity;
    private int maxMemory;
    private LinkedHashMap<String, Software> software;
    private int usedCapacity;
    private int usedMemory;

    Hardware(String name, String type, int maxCap, int maxMem) {
        super(name, type);
        this.setMaxCapacity(maxCap);
        this.setMaxMemory(maxMem);
        this.setSoftwares();
        this.setUsedMemory(0);
        this.setUsedCapacity(0);
    }

    public final int getMaxCapacity() {
        return this.maxCapacity;
    }

    private void setMaxCapacity(int maxCapacity) {
        if (this.getType().equals("Power Hardware")) {
            maxCapacity -= ((maxCapacity * 3) / 4);
        } else {
            maxCapacity *= 2;
        }
        this.maxCapacity = maxCapacity;
    }

    public final int getMaxMemory() {
        return this.maxMemory;
    }

    private void setMaxMemory(int maxMemory) {
        if (this.getType().equals("Power Hardware")) {
            maxMemory += ((maxMemory * 3) / 4);
        } else {
            maxMemory -= maxMemory / 4;
        }
        this.maxMemory = maxMemory;
    }

    public final LinkedHashMap<String, Software> getSoftware() {
        return this.software;
    }

    private void setSoftwares() {
        this.software = new LinkedHashMap<>();
    }

    public final int getUsedCapacity() {
        return this.usedCapacity;
    }

    private void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public final int getUsedMemory() {
        return this.usedMemory;
    }

    private void setUsedMemory(int usedMemory) {
        this.usedMemory = usedMemory;
    }

    public boolean tryAddSoftware(Software soft) {
        if ( this.getMaxCapacity() - this.getUsedCapacity() >= soft.getCapacityConsumption() &&
                this.getMaxMemory() - this.getUsedMemory() >= soft.getMemoryConsumption()){
            this.getSoftware().put(soft.getName(), soft);
            this.setUsedMemory(this.getUsedMemory() + soft.getMemoryConsumption());
            this.setUsedCapacity(this.getUsedCapacity() + soft.getCapacityConsumption());
            return true;
        }
        return false;
    }

    public boolean tryRemoveSoftware(String softwareName) {
        if (this.getSoftware().containsKey(softwareName)) {
            Software soft = this.getSoftware().get(softwareName);
            this.setUsedCapacity(this.getUsedCapacity() - soft.getCapacityConsumption());
            this.setUsedMemory(this.getUsedMemory() - soft.getMemoryConsumption());
            this.getSoftware().remove(soft.getName());
            return true;
        }
        return false;
    }
}