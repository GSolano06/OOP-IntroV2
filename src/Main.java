import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myTextScanner = new Scanner(System.in);

      Team team1 = new Team("NBA", "Basketball", false, "Golden State Warriors", 22,10,"San Francisco,",1, 1,"Go Warriors!");
      Team team2 = new Team("NFL","Football",false,"Eagles", 53,24,"Philadelphia",1,1,"Go Eagles!");
      Player player1 = new Player("Steph", "Curry", 30, team1, "Point Guard" );

        Coach coach1 = new Coach("Steve Kerr",team1, 17500000, 10,true );

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
        }



