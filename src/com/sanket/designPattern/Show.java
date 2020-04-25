package com.sanket.designPattern;

public class Show implements PrototypeCapabilityIf {
    private String name;

    @Override
    public PrototypeCapabilityIf copy() throws CloneNotSupportedException {
        System.out.println("copying SHOW object!");
        return (Show)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Show";
    }
}
