import java.util.Scanner;
 class Player {
    //Fields
    private Scanner myTextScanner = new Scanner(System.in);
    private int jerseyNum;
    //Team team;
    private String position;
    private Team team;
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
         this.team = team;
         this.position = position;

     }
     //Getters and Setters


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

     public Team getTeam() {
         return team;
     }

     public void setTeam(Team team) {
         this.team = team;
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

     //Methods
    void describe(){
        if(captain == true) {
            System.out.print("Player:" + firstName + " " + lastName + ", " + "Jersey #:" + jerseyNum + ", " + "Position:" + position + ", " + "Team:" + team.name + ",");
            System.out.println("Captain:Yes");
        }else{
            System.out.println("Player:" + firstName + " " + lastName + ", " + "Jersey #:" + jerseyNum + ", " + "Position:" + position + ", " + "Team:" + team.name + ",");
            System.out.println("Captain:no");
        }
    }



    void makeCaptain(Scanner scanner){
        System.out.println("Would you like to make " + firstName + " " + lastName + " a captain for " + team.name + ", Yes or no?");
        String answerTyped = myTextScanner.nextLine();
        if(answerTyped == "Yes"){
            System.out.println("Congratulations to " + lastName + " on becoming a captain!");
        }

        if(answerTyped == "No"){
            System.out.println(("Unfortunate, try again next time pal."));
        }


    }

    void joinCheer() {
        if (captain == true) {
             System.out.println(team.cheer);

        }
    }
}
