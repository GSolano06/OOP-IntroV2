import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner myTextScanner = new Scanner(System.in);


        Team team1 = new Team("NBA","Basketball", false, "Golden State Warriors", 22,10,"San Francisco,",1, 1,"Go Warriors!");
        Team team2 = new Team("NFL","Football",false,"Eagles", 53,24,"Philadelphia",1,1,"Go Eagles!");
        Player player1 = new Player("Steph", "Curry", 30, team1, "Point Guard" );
        Player player2 = new Player("Draymond", "Green", 23, team1, "Center");
        Player player3 = new Player("Jonathan", "Kuminga", 00, team1, "Power Forward");
        Player player4 = new Player("Brandin", "Podziemski", 2, team1, "Shooting Guard");
        Player player5 = new Player("Andrew", "Wiggins", 22, team1, "Small Forward");
        ArrayList <Player> allPlayers = new ArrayList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);
        allPlayers.add(player3);
        allPlayers.add(player4);
        allPlayers.add(player5);
        Coach coach1 = new Coach("Steve Kerr",team1, 17500000, 10,true );

        boolean stillAsk = true;
       /* while (stillAsk) {
            System.out.println("");
            System.out.print("Coach Name: ");
            String nameTyped = myTextScanner.nextLine();  // Read user input
            System.out.println(" THANKS!");

            if (nameTyped.equals("DONE")) {
                stillAsk = false;
                continue;
            }

            Coach coachFound = null;
            if (coach1.nameMatches(nameTyped)) {
                coachFound = coach1;
            }

            if (coachFound == null) {
                System.out.println("Coach, " + nameTyped + " not found! Can't produce info!");
            } else {
                coachFound.describe();
                coachFound.reasign(team2);
                coachFound.reasign(team2);


                player1.describe();
                team1.describe();

            } */
       // }

        for (Player player : allPlayers){
            if (player.getTeam() == team1){
                team1.addPlayerToRoster(player);
            } else if (player.getTeam() == team2) {
                team2.addPlayerToRoster(player);
            }
        }
        System.out.println(team1);
        player1.describe();
        team1.describe();
        team1.updateRecord();
        player1.makeCaptain(myTextScanner);

            }
        }