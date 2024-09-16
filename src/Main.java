import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Team GoldenStateWarriors = new Team();

        Player player1 = new Player();
player1.firstName = "Steph";
player1.lastName = "Curry";
player1.team = GoldenStateWarriors;
player1.position = "PG";
player1.sport = "Basketball";
player1.jerseyNum = 30;



GoldenStateWarriors.name = "Golden State Warriors";
GoldenStateWarriors.home = "San Francisco";
GoldenStateWarriors.numPlayers = 22;
GoldenStateWarriors.league ="NBA";
GoldenStateWarriors.sport = "Basketball";
GoldenStateWarriors.college = false;
GoldenStateWarriors.numCoaches = 10;

        player1.describe();

        GoldenStateWarriors.describe();
    }
}