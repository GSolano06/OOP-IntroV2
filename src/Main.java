import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner myTextScanner = new Scanner(System.in);


        Team team1 = new Team("NBA", "Basketball", false, "Golden State Warriors", 22, 10, "San Francisco,", 1, 1, "Go Warriors!");
        Team team2 = new Team("NFL", "Football", false, "Eagles", 53, 24, "Philadelphia", 1, 1, "Go Eagles!");
        Player player1 = new Player("Steph", "Curry", 30, team1, "Point Guard");
        Player player2 = new Player("Draymond", "Green", 23, team1, "Center");
        Player player3 = new Player("Jonathan", "Kuminga", 00, team1, "Power Forward");
        Player player4 = new Player("Brandin", "Podziemski", 2, team1, "Shooting Guard");
        Player player5 = new Player("Andrew", "Wiggins", 22, team1, "Small Forward");
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);
        allPlayers.add(player3);
        allPlayers.add(player4);
        allPlayers.add(player5);
        Coach coach1 = new Coach("Steve Kerr", team1, 17500000, 10, true);

        ArrayList<Coach> allCoaches = new ArrayList<>();
        ArrayList<Team> allTeams = new ArrayList<>();
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
                            if (teamFound != null) {
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
            }

            for (Player player : allPlayers) {
                if (player.getCurrentTeam() == team1) {
                    team1.addPlayerToRoster(player);
                } else if (player.getCurrentTeam() == team2) {
                    team2.addPlayerToRoster(player);
                }
            }

            player1.addTeam(team1);
            System.out.println(player2);
            System.out.println(team1);
            player1.addTeam(team1);
            team1.describe();
            player1.teamHistory();
            team1.updateRecord();

            player1.makeCaptain(myTextScanner);

        }
    }
}
