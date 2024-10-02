package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import static org.example.Colors.*;

public class Snap extends CardGame {

    private Boolean hasSnapped = false;
    private String userInput, name=null;
    private final Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
    }

    public void startSnapGame() {
        Card cardDealt;
        Card previousCardDealt = null;
        boolean isPlayer1 = true;

        introMessage();

        System.out.println("Enter the first player's name");
        name = getPlayerName();
        Player player1 = new Player(name, YELLOW.getColor());

        System.out.println("Enter the second player's name");
        name = getPlayerName();
        Player player2 = new Player(name, BLUE.getColor());

        System.out.println(player1.getFontColor() + player1.getName() + " to start the game.");
        System.out.println("Please press Enter");
        checkForEnterKeystroke();

        while (userInput.isEmpty()) {
            cardDealt = this.dealCard();
            System.out.println(cardDealt);

            checkIfSnap();
            if(hasSnapped){
                if((previousCardDealt != null) && (cardDealt.getSYMBOL().equals(previousCardDealt.getSYMBOL()))){
                    System.out.println(GREEN.getColor() + "Its a match!");
                    System.out.println("You Win!!");
                    System.out.println(WHITE.getColor() + "Would you like to play again? (Y/N)");
                    restartGame();
                    break;
                }else{
                    System.out.println(RED.getColor() + "Not a match");
                }
            }
            else{
                if((previousCardDealt != null) && (cardDealt.getSYMBOL().equals(previousCardDealt.getSYMBOL()))){
                    System.out.println(RED.getColor() + "You missed a match!");
                }
            }

            previousCardDealt = cardDealt;

            System.out.println("______________________________");

            if(isPlayer1){
                System.out.println(player2.getFontColor() + player2.getName() + "'s turn");

            }else {
                System.out.println(player1.getFontColor() + player1.getName() + "'s turn");
            }

            isPlayer1 = !isPlayer1;

            checkForEnterKeystroke();
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

    public String getPlayerName(){
        name = scanner.nextLine();
        while(name.isEmpty()){
            System.out.println("Name cannot be empty");
            name = scanner.nextLine();
        }
        return name;
    }

    public void checkForEnterKeystroke(){
        userInput = scanner.nextLine();

        while(!userInput.isEmpty()){
            System.out.println("You only need to press Enter");
            userInput = scanner.nextLine();
        }
    }

    public void checkIfSnap(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
                    if(hasSnapped.equals(false)){
                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_ENTER);
                    }
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Timer timer = new Timer();
        timer.schedule(task,2000);
        userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("snap")){
            hasSnapped= userInput.equalsIgnoreCase("snap") ;
        } else if (!userInput.isEmpty()) {
            System.out.println(RED.getColor() + "Invalid string: only snap or 'Enter' permitted.");
        }

        timer.cancel();
    }

    public void restartGame(){
        String restart = scanner.nextLine();
        if(restart.equalsIgnoreCase("y")){
            System.out.println("Restarting .....");
            startSnapGame();
        }else if(restart.equalsIgnoreCase("n")){
            System.out.println("Game Closing ....");
        }else{
            System.out.println("Please enter either 'y' or 'n'");
            restartGame();
        }
    }

}