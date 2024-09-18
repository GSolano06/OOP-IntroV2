public class Coach {
    // fields
    String name;
    Team team;
    int salary;
    int yearsCoaching;
    boolean exPlayer;

    //methods
    boolean nameMatches(String searchText) {
        if (name.equalsIgnoreCase(searchText)) {
            return true;
        }
        return false;
    }
    boolean update(Team otherTeam) {
        if (team.name.equalsIgnoreCase(otherTeam.name)) {
            return true;
        }
        return false;
    }

    void describe() {
        System.out.println("Coach info: " + name + ", is the coach of the " + team.name + ". They have been coaching for " + yearsCoaching + " years. Their salary is " + salary + " a year. Ex-Player = " + exPlayer + ".");
    }


    void reasign( Team newTeam) {
        team = newTeam;
    }

}
