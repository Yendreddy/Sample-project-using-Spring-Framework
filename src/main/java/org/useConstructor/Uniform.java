package org.useConstructor;

public class Uniform implements Student{
    public static int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private static int size;
    public Uniform(int size){
        this.size = size;
    }
    public void study(){
        System.out.println("I will go to study in uniform");
    }
}
