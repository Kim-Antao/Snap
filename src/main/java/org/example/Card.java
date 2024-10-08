package org.example;

public class Card {

    private String suit ;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSYMBOL() {
        return symbol;
    }

    public String getSUIT() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.symbol + " " + this.suit;

    }
}
