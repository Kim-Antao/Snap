package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;
    // heart     diamond    spade     club
    private final String[] SUIT = {"\u2661", "\u2662", "\u2664", "\u2667"};
    private final String[] SYMBOL = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] VALUE = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public CardGame(String name){
        this.name = name;
//        generateDeckOfCard();
    }

    public void generateDeckOfCard(){
        for(int i = 0; i < SUIT.length; i++){
            for(int j = 0; j < SYMBOL.length; j++){
                deckOfCards.add(new Card(SUIT[i], SYMBOL[j], VALUE[j] ));
            }
        }
    }

    public String getDeck(){
        return (deckOfCards.toString());
    }

    public Card dealCard(){
        if(deckOfCards.isEmpty()){
            generateDeckOfCard();
            shuffleDeck();
        }
        Card topCard = deckOfCards.getLast();
        deckOfCards.removeLast();

        return topCard;
    }

    public void sortDeckInNumber(){
       // sort the deck by number 222233334444
        deckOfCards.sort(new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                return Integer.compare(c1.getValue(), c2.getValue());
            }
        });
//        return deckOfCards;
    }

    public void sortDeckIntoSuits() {
        // 2,3,4... of heart, 2,3,4.... of diamonds
        deckOfCards.sort(new Comparator<Card>(){
            public int compare(Card c1, Card c2){
                return String.valueOf(c1.getSUIT()).compareTo(c2.getSUIT());
            }
        });
//         return deckOfCards;
    }

    public void shuffleDeck(){
        // shuffle into a random order
        Collections.shuffle(deckOfCards);
//        return deckOfCards;
    }
}
