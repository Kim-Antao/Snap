package org.example;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<String> deckOfCards = new ArrayList<>();

    public CardGame(){
//        deckOfCards.add("1");
//        deckOfCards.add("3");
    }

    public String getDeck(){
        return deckOfCards.toString();
    }
}
