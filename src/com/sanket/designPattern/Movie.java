package com.sanket.designPattern;

public class Movie implements PrototypeCapabilityIf {

    private String name;

    @Override
    public PrototypeCapabilityIf copy() throws CloneNotSupportedException {
        System.out.println("copying MOVIE object!");
        return (Movie)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Movie";
    }
}
