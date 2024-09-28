package org.example;

import java.util.Scanner;
import java.util.Timer;


// add restart function
public class Snap extends CardGame {

//    int noOfPlayers;
    Boolean hasSnapped;
    String userInput;

    Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
//        this.noOfPlayers = noOfPlayers;
    }

    public void startSnapGame() {
        introMessage();
        Card cardDealt;
        Card previousCardDealt = null;

        boolean isPlayer1 = true;
        String name;

        System.out.println("Enter the first player's name");
        name = scanner.nextLine();
        name = checkIfEmpty(name);
        Player player1 = new Player(name);

        System.out.println("Enter the second player's name");
        name = scanner.nextLine();
        name = checkIfEmpty(name);
        Player player2 = new Player(name);

        System.out.println(player1.getName() + " to start the game.");
        System.out.println("Please press Enter");
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

            if(isPlayer1){
                System.out.println(player2.getName() + "'s turn");

            }else {
                System.out.println(player1.getName() + "'s turn");
            }

            isPlayer1 = !isPlayer1;

userInput = scanner.nextLine();
            waitTillUserPressesEnter();
        }
    }

    public void introMessage(){
        System.out.println("________________________________");
        System.out.printf("         %S GAME  \n", this.getName());
        System.out.println("________________________________");
        System.out.println("Instructions: ");
        System.out.println("1. Press 'Enter' when it's your turn, to deal a new card");
        System.out.println("2. If the symbol matches the previous card, type 'snap'");
        System.out.println("   If you do so within 2 secs, you win the game.\n");

    }
    public void waitTillUserPressesEnter(){
        while(!userInput.isEmpty()){
            System.out.println("You only need to press Enter");
            userInput = scanner.nextLine();
        }
    }

    public void checkIfSnap(){
        Timer timer = new Timer();
//        timer.schedule(task,2000);
        userInput = scanner.nextLine();
        hasSnapped= userInput.equalsIgnoreCase("snap") ;
        timer.cancel();
    }

    public String checkIfEmpty(String name){
        while(name.isEmpty()){
            System.out.println("Name cannot be empty");
            name = scanner.nextLine();
        }
        return name;
    }

}