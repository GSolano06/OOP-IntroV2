//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Twyla and Dylan!");

        Team GoldenStateWarriors = new Team();

        GoldenStateWarriors.name = "Golden State Warriors";
        GoldenStateWarriors.home = "San Francisco";
        GoldenStateWarriors.numPlayers = 22;
        GoldenStateWarriors.league ="NBA";
        GoldenStateWarriors.sport = "Basketball";
        GoldenStateWarriors.college = false;
        GoldenStateWarriors.numCoaches = 10;

    GoldenStateWarriors.describe();
    }
}