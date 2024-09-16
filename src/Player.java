public class Player {
    int jerseyNum;
    //Team team;
    String position;
    Team team;
    int yearsPlaying;
    String sport;
    String firstName;
    String lastName;

    boolean captain;

        void describe(){
            System.out.println("Player:" + firstName + " " + lastName + ", " + "Jersey #:" + jerseyNum + ", " + "Position:" + position +", " + "Team:" + team.name);
        }

        void makeCaptain(){
            captain = true;
        }

        void callLine() {
            if (captain == true) {
                System.out.println();
            }
        }
}
