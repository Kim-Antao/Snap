package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
    }

    public void startSnapGame() {

        Scanner scanner = new Scanner(System.in);
        Card cardDealt;
        Card previousCardDealt = null;

        System.out.println("Click enter to start the game");
        String userInput = scanner.nextLine();
        while (userInput.isEmpty()) {
            cardDealt = this.dealCard();
            System.out.println(cardDealt);
            if((previousCardDealt != null) && (cardDealt.getSYMBOL().equals(previousCardDealt.getSYMBOL()))){
                System.out.println("SNAP!!!");
                break;
            }
            previousCardDealt = cardDealt;
            System.out.println("Press Enter");
            userInput = scanner.nextLine();

        }

    }
}