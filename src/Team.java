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


    void describe(){
    System.out.println("Team: "+ name +" Home: " + home + " Sport: "+ sport +" League: " + league + " Current Players: " + numPlayers +" Coaches: "+ numCoaches);

    };
    void updateRecord() {
        boolean gameWon;
        String update = myTextScanner.nextLine();
        System.out.print("Update Record. Game Won or lost?");



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
}