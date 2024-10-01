import java.util.ArrayList;
import java.util.Scanner;
 class Player {
    //Fields
    private ArrayList<Team> myTeamHistory;
    private Scanner myTextScanner = new Scanner(System.in);
    private int jerseyNum;
    //Team team;
    private String position;
    private Team currentTeam;
    private int yearsPlaying;
    private String sport;
    private String firstName;
    private String lastName;
    private boolean captain;

    //Constructors
     Player (String firstName, String lastName, int jerseyNum, Team team , String position) {

         this.firstName = firstName;
         this.lastName = lastName;
         this.jerseyNum = jerseyNum;
         this.currentTeam = team;
         this.position = position;
         this.myTeamHistory = new ArrayList<Team>();
     }

     //Getters and Setters
     public ArrayList<Team> getAllTeamHistory() {
         return myTeamHistory;
     }

     public void setAllTeamHistory(ArrayList<Team> allTeamHistory) {
         this.myTeamHistory = myTeamHistory;
     }

     public int getJerseyNum() {
         return jerseyNum;
     }

     public void setJerseyNum(int jerseyNum) {
         this.jerseyNum = jerseyNum;
     }

     public String getPosition() {
         return position;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public Team getCurrentTeam() {
         return currentTeam;
     }

     public void setCurrentTeam(Team currentTeam) {
         this.currentTeam = currentTeam;
     }

     public int getYearsPlaying() {
         return yearsPlaying;
     }

     public void setYearsPlaying(int yearsPlaying) {
         this.yearsPlaying = yearsPlaying;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public boolean isCaptain() {
         return captain;
     }

     public void setCaptain(boolean captain) {
         this.captain = captain;
     }

     public Scanner getMyTextScanner() {
         return myTextScanner;
     }

     public void setMyTextScanner(Scanner myTextScanner) {
         this.myTextScanner = myTextScanner;
     }

     public String getSport() {
         return sport;
     }

     public void setSport(String sport) {
         this.sport = sport;
     }

     //Methods
    void describe(){
        if(captain == true) {
            System.out.print("Player:" + firstName + " " + lastName + ", " + "Jersey #:" + jerseyNum + ", " + "Position:" + position + ", " + "Team:" + currentTeam.getName() + ",");
            System.out.println("Captain:Yes");
        }else{
            System.out.println("Player:" + firstName + " " + lastName + ", " + "Jersey #:" + jerseyNum + ", " + "Position:" + position + ", " + "Team:" + currentTeam.getName() + ",");
            System.out.println("Captain:no");
        }
    }

    void addTeam(Team team) {
         this.myTeamHistory.add(team);
    }

    public String toString(){
         return "Player " + this.firstName + " " + this.lastName + " is number " + this.jerseyNum + " on the " + currentTeam.getName() + "!";
    }


    void makeCaptain(Scanner scanner){
        System.out.println("Would you like to make " + firstName + " " + lastName + " a captain for " + currentTeam.getName() + ", Yes or no?");
        String answerTyped = myTextScanner.nextLine();
        if(answerTyped.equalsIgnoreCase("Yes")){
            System.out.println("Congratulations to " + lastName + " on becoming a captain!");
        }

        if(answerTyped.contains("No")){
            System.out.println(("Unfortunate, try again next time pal."));
        }


    }

    void joinCheer() {
        if (captain == true) {
             System.out.println(currentTeam.getCheer());

        }
    }
    void teamHistory(){
         System.out.println("Would you like to know " + this.lastName + " team history?");
         String yesOrNo = myTextScanner.nextLine();
         if(yesOrNo.contains("Yes")){
             System.out.println(myTeamHistory);

         }else{
             System.out.println("Okay!");
         }

    }
}
