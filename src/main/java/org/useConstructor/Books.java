package org.useConstructor;

public class Books implements Student{
    public static String getWhichClass() {
        return whichClass;
    }

    public void setWhichClass(String whichClass) {
        this.whichClass = whichClass;
    }

    private static String whichClass;
    public Books(String whichClass){
        this.whichClass = whichClass;
    }
    public void study(){
        System.out.println("I will study in books");
    }
}
