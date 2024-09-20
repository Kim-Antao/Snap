package org.example;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(){

    }
    
    public String getDeck(){
        return (deckOfCards.toString());
    }

    public Card dealCard(){
        return deckOfCards.get(0);
    }

    public ArrayList<Card> sortDeckInNumber(){
       // sort the deck by number 222233334444
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        // 2,3,4... of heart, 2,3,4.... of diamonds
         return deckOfCards;
    }

    public ArrayList<Card> shuffleDeck(){
        // shuffle into a random order
        return deckOfCards;
    }
}
