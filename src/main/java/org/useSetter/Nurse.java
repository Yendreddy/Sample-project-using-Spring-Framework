package org.useSetter;

public class Nurse implements Staff{
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    private String work;

    public void assist(){
        System.out.println("I am nurse");
    }
}
