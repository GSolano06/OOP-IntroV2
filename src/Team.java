import java.util.Scanner;

public class Team {
  private  Scanner myTextScanner = new Scanner(System.in);

    private String league;
    private String sport;
    private boolean college;
    private String name;
    private int numPlayers;
    private int numCoaches;
    private String home;
    private int winRecord;
    private int lossRecord;
    private String cheer;
    private Player newPlayer1;

    public String getLeague() {
        return league;
    }

    public String getCheer() {
        return cheer;
    }

    public int getLossRecord() {
        return lossRecord;
    }

    public int getWinRecord() {
        return winRecord;
    }

    public String getHome() {
        return home;
    }

    public int getNumCoaches() {
        return numCoaches;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public String getName() {
        return name;
    }

    public boolean isCollege() {
        return college;
    }

    public String getSport() {
        return sport;
    }

    public Scanner getMyTextScanner() {
        return myTextScanner;
    }

    public Team(String league, String sport, boolean college, String name, int numPlayers, int numCoaches, String home, int winRecord, int lossRecord, String cheer) {
        this.league = league;
        this.sport = sport;
        this.college = college;
        this.name = name;
        this.numPlayers = numPlayers;
        this.numCoaches = numCoaches;
        this.home = home;
        this.winRecord = winRecord;
        this.lossRecord = lossRecord;
        this.cheer = cheer;
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