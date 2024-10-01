import java.util.Scanner;

public class Team {
    Scanner myTextScanner = new Scanner(System.in);

    String league;
    String sport;
    boolean college;
    String name;
    int numPlayers;
    int numCoaches;
    String home;
    int winRecord;
    int lossRecord;
    String cheer;
    Player newPlayer1;

    boolean nameMatches(String searchText) {
        if (name.equalsIgnoreCase(searchText)) {
            return true;
        }
        return false;
    }

    void describe(){
    System.out.println("Team: "+ name +" Home: " + home + " Sport: "+ sport +" League: " + league + " Current Players: " + numPlayers +" Coaches: "+ numCoaches);

    };
    void updateRecord() {
        boolean gameWon;
        System.out.print("Update Record. Game Won or lost?");
        String update = myTextScanner.nextLine();



        if (update.contains("W") || update.contains ("w")){
            gameWon=true;
            winRecord = winRecord + 1;
            System.out.println("Congratulations! New Record: " + winRecord + " " + lossRecord);
        }
        if (update.contains("L") || update.contains("l")){
            gameWon =false;
            lossRecord=lossRecord+1;
            System.out.println("Sucks to suck! New Record: " + winRecord + " " + lossRecord);
        }
    }
    /*
    void addPlayerToRoster(Player newPlayer){
        System.out.println("Add a new player to " + name + ". Type player last name below:");
        newPlayer1 = newPlayer;
        System.out.println(newPlayer.lastName + " added to " + name);
    }

     */
}