package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {
                    // heart     diamond    spade     club
    private final String[] SUIT = {"\u2661", "\u2662", "\u2664", "\u2667"};
    private final String[] SYMBOL = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] VALUE = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    @Override
    public String toString() {
        return "Card{" +
                "SUIT=" + Arrays.toString(SUIT) +
                ", SYMBOL=" + Arrays.toString(SYMBOL) +
                ", VALUE=" + Arrays.toString(VALUE) +
                '}';
    }
}
