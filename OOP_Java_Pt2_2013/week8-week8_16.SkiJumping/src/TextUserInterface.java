
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amigo
 */
public class TextUserInterface {

    private Scanner reader;
    private Tournament tournament;

    public TextUserInterface(Scanner reader) {
        this.reader = reader;
        this.tournament = new Tournament();
    }

    public void start() {
        //Initialize the competition
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("\nThe tournament begins!");
                tournamentPhase();
                break;
            }
            tournament.addJumper(new Jumper(name));
        }
    }

    private void tournamentPhase() {
        String command;
        int round = 1;
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit:");
            command = reader.nextLine();
            if (command.equals("quit")) {
                tournament.printFinalStandings();
                break;
            } else if (command.equals("jump")) {
                System.out.println("\nRound " + round + "\n");
                System.out.println("Jumping order:");
                tournament.printJumpingOrder();
                tournament.makeJumps();
                System.out.println("");
                System.out.println("Results of round " + round);
                tournament.printJumps(round - 1);
                round++;
            }
        }
    }

}
