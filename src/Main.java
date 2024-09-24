import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myTextScanner = new Scanner(System.in);

        Player player1 = new Player();

      Team team1 = new Team("NBA", "Basketball", false, "Golden State Warriors", 22,10,"San Francisco,",1, 1,"Go Warriors!");
        Team team1 = new Team();
        Team team2 = new Team();
        Player player1 = new Player("Steph", "Curry", 30, team1, "Point Guard" );



        team1.name = "Golden State Warriors";
        team1.home = "San Francisco";
        team1.numPlayers = 22;
        team1.league = "NBA";
        team1.sport = "Basketball";
        team1.college = false;
        team1.numCoaches = 10;
        team1.winRecord = 1;
        team1.lossRecord = 1;
        team1.cheer = "Let's Go Warriors!";

        team2.name = "Seventy Sixers";
        team2.home = "Philadelphia";
        team2.numPlayers = 25;
        team2.league ="NBA";
        team2.sport = "Basketball";
        team2.college = false;
        team2.numCoaches = 11;
        Coach coach1 = new Coach();
        coach1.name = "Steve Kerr";
        coach1.team = team1;
        coach1.salary = 17500000;
        coach1.yearsCoaching = 10;
        coach1.exPlayer = true;

        Coach coach1 = new Coach("Steve Kerr",team1, 17500000, 10,true );

        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
      /*  boolean stillAsk = true;
        boolean stillAsk = true;
        while (stillAsk) {
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


                player1.describe();
                team1.describe();

            }
        }


        player1.describe();
        team1.describe();
        team1.updateRecord();
        player1.makeCaptain(myTextScanner);

            }
        }*/

        player1.describe();
        team1.describe();
        team1.updateRecord();
        player1.makeCaptain();
        team1.addPlayerToRoster(player1);
    }
}

