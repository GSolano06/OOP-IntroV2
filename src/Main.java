import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myTextScanner = new Scanner(System.in);

        Team team1 = new Team();
        Team team2 = new Team();
        Player player1 = new Player("Steph", "Curry", 30, team1, "Point Guard");


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
        team2.league = "NBA";
        team2.sport = "Basketball";
        team2.college = false;
        team2.numCoaches = 11;

        ArrayList<Coach> allCoaches = new ArrayList<Coach>();
        ArrayList<Team> allTeams = new ArrayList<Team>();

        Coach coach1 = new Coach("Steve Kerr", team1, 17500000, 10, true);

        allCoaches.add(coach1);
        allTeams.add(team1);

        boolean stillAsk = true;
        while (stillAsk) {
            System.out.println("Search:");

            String command = myTextScanner.nextLine();  // Read user input
            if (command.equalsIgnoreCase("COACH")) {

                System.out.print("Coach Name: ");
                String nameTyped = myTextScanner.nextLine();  // Read user input

                Coach coachFound = null;
                for (Coach coach : allCoaches) {
                    if (coach.nameMatches(nameTyped)) {
                        coachFound = coach;

                        System.out.println("Command:");
                        String command2 = myTextScanner.nextLine();  // Read user input
                        if (command2.equalsIgnoreCase("UPDATE")) {
                            System.out.print("INPUT NEW TEAM:");

                            String newTeamNameTyped = myTextScanner.nextLine();  // Read user input

                            Team teamFound = null;
                            for (Team team : allTeams) {
                                if (team.nameMatches(newTeamNameTyped)) {
                                    teamFound = team;


                                }
                            }
                            if (teamFound != null){
                                coachFound.reasign(teamFound);
                            }
                        }

                        if (coachFound == null) {
                            System.out.println("Coach, " + nameTyped + " not found! Can't produce info!");
                        } else {
                            System.out.println(coach);

                            player1.describe();
                            team1.describe();

                        }

                    } else if (command.equalsIgnoreCase("DONE")) {
                        stillAsk = false;
                        continue;
                    }

                }


                player1.describe();
                team1.describe();
                team1.updateRecord();
                player1.makeCaptain(myTextScanner);

            }
        }
    }
}