package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    int noOfPlayers;
    Boolean hasSnapped;
    String userInput;

    Scanner scanner = new Scanner(System.in);

    public Snap(String name, int noOfPlayers) {
        super(name);
        this.noOfPlayers = noOfPlayers;
    }

    public void startSnapGame() {

        Card cardDealt;
        Card previousCardDealt = null;

        System.out.println("Click Enter to start the game");
        userInput = scanner.nextLine();

        waitTillUserPressesEnter();

        while (userInput.isEmpty()) {
            cardDealt = this.dealCard();
            System.out.println(cardDealt);
            checkIfSnap();
            if(hasSnapped){
                if((previousCardDealt != null) && (cardDealt.getSYMBOL().equals(previousCardDealt.getSYMBOL()))){
                    System.out.println("Its a match!");
                    System.out.println("You Win!!");
                    break;
                }else{
                    System.out.println("Not a match");
                }
            }
            else{
                if((previousCardDealt != null) && (cardDealt.getSYMBOL().equals(previousCardDealt.getSYMBOL()))){
                    System.out.println("You missed a match!");
                }
            }
            previousCardDealt = cardDealt;

            waitTillUserPressesEnter();

        }

    }

    public void waitTillUserPressesEnter(){
        while(!userInput.isEmpty()){
            System.out.println("You only need to press Enter");
            userInput = scanner.nextLine();
        }
    }

    public void checkIfSnap(){
        userInput = scanner.nextLine();
        hasSnapped= userInput.equalsIgnoreCase("snap") ;
    }


}