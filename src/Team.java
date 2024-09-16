public class Team {

    String league;
    String sport;
    boolean college;
    String name;
    int numPlayers;
    int numCoaches;
    String home;
    int winRecord;
    int lossRecord;


    void describe(){
    System.out.println("Team: "+ name +" Home: " + home + " Sport: "+ sport +" League: " + league + " Current Players: " + numPlayers +" Coaches: "+ numCoaches);

    };
   // void updateRecord(boolean gameWon) {
     //   if (gameWon=true) {
     //       winRecord = winRecord + 1;
      //  } else {
      //      lossRecord=lossRecord+1;
      //  }
   // }
   // void addPlayer(Player newPlayer){
    //};
}