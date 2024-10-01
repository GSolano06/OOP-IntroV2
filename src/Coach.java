import java.util.ArrayList;

public class Coach {
    // fields
    private String name;
    private Team team;
    private int salary;
    private int yearsCoaching;
    private boolean exPlayer;
    private ArrayList<Team> coachingHistory;

    public Coach(String name, Team team, int salary, int yearsCoaching, boolean exPlayer) {

    this.name = name;
    this.team = team;
    this.salary = salary;
    this.yearsCoaching = yearsCoaching;
    this.exPlayer = exPlayer;
}
    //methods
    boolean nameMatches(String searchText) {
        if (name.equalsIgnoreCase(searchText)) {
            return true;
        }
        return false;
    }

    void describe() {
        System.out.println("Coach info: " + name + ", is the coach of the " + team.name + ". They have been coaching for " + yearsCoaching + " years. Their salary is " + salary + " a year. Ex-Player = " + exPlayer + ".");
    }


    void reasign(Team newTeam) {
        team = newTeam;
    }

}
