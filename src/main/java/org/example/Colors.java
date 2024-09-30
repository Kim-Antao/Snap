package org.example;

public enum Colors {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    WHITE("\u001B[37m");

    public final String color;

    Colors(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
