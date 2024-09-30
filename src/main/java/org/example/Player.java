package org.example;

public class Player {

    private String name;
    private String fontColor;

    public Player(String name, String fontColor){
        this.name = name;
        this.fontColor = fontColor;
    }

    public String getName() {
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }
}
