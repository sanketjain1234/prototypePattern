package com.sanket.designPattern;

public class Album implements PrototypeCapabilityIf {
    private String name;

    @Override
    public PrototypeCapabilityIf copy() throws CloneNotSupportedException {
        System.out.println("copying ALBUM object!");
        return (Album)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Album";
    }
}
