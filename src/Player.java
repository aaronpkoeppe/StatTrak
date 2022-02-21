public class Player {
    private String team;
    private String name;
    private int playerNumber;
    private double fieldGoals_freeThrow;
    private double fieldGoals_2pt;
    private double fieldGoal_3pt;

    public int fouls;
    private double attempts;
    private int totalPoints;

    public Player() {
        this.team = null;
        this.name = null;
        this.playerNumber = 0;
        this.fieldGoals_freeThrow = 0;
        this.fieldGoals_2pt = 0;
        this.fieldGoal_3pt = 0;
        this.fouls = 0;
        this.attempts = 0;

    }

    public Player(String name, int number) {
        this.name = null;
        this.playerNumber = 0;
        this.fieldGoals_freeThrow = 0;
        this.fieldGoals_2pt = 0;
        this.fieldGoal_3pt = 0;
        this.fouls = 0;


    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String teamName) {
        this.team = teamName;
    }

    public String getPlayerName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void shotAttempt(int shotType, boolean made) {
        switch (shotType) {
            case 1:
                attempts++;
                fieldGoals_freeThrow += made ? 1 : 0;
                if(made){
                    totalPoints = totalPoints + 1;
                }
                break;
            case 2:
                attempts++;
                fieldGoals_2pt += made ? 1 : 0;
                if (made) {
                    totalPoints = totalPoints + 2;
                }
                break;
            case 3:
                attempts++;
                fieldGoal_3pt += made ? 1 : 0;
                if(made){
                    totalPoints = totalPoints + 3;
                }
                break;

            default:
                System.out.println("invalid shot type: " + shotType);
        }
    }

    public double getOnePointer() {
        return fieldGoals_freeThrow;
    }

    public double getTwoPointer() {
        return fieldGoals_2pt;
    }

    public double getThreePointer() {
        return fieldGoal_3pt;
    }

    public void displayStats() {
        System.out.println("#" + playerNumber + " " + name + " Fouls = " + fouls + " points = " + totalPoints);
        System.out.println("                    Attempts            Made            Percentage");
        if (fieldGoals_freeThrow == 0){
            System.out.println("Free Throws" + "              " + attempts + "             " + fieldGoals_freeThrow + "                    " + "0");
        }
       else  System.out.printf("Free Throws" +  "              " + attempts + "             " +  fieldGoals_freeThrow + "                    %.2f\n", (fieldGoals_freeThrow/attempts) * 100.0);

       if (fieldGoals_2pt == 0){
           System.out.println("2pt field goals" + "          " + attempts +  "             " + fieldGoals_2pt + "                    " + "0");
       }
       else System.out.printf("2pt field goals" + "          " + attempts +  "             " + fieldGoals_2pt + "                     %.2f\n", (fieldGoals_2pt/attempts) * 100.0);

        if (fieldGoal_3pt == 0){
            System.out.println("3pt field goals" + "          " + attempts +  "             " + fieldGoal_3pt + "                    " + "0");
        }
        else System.out.printf("3pt field goals" + "          " + attempts +  "             " + fieldGoal_3pt + "                 %.2f\n", (fieldGoal_3pt/attempts) * 100.0);

    }
    public int getFouls(){
        return fouls;

    }
    public void setFouls(int fouls) {
        this.fouls = fouls;
    }
    public String getTeamName(){
        return team;
    }
    public int getTotalPoints(){
        return totalPoints;
    }



}

