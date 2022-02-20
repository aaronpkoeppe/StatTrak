public class Player {
    private String team;
    private String name;
    private int playerNumber;
    private int fieldGoals_freeThrow;
    private int fieldGoals_2pt;
    private int fieldGoal_3pt;
    public int fouls;
    private int attempts;
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

    public String getPlayerName(String playerName, int number) {
        this.name = playerName;
        this.playerNumber = number;
        return playerName;
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
                break;
            case 2:
                attempts++;
                fieldGoals_2pt += made ? 1 : 0;
                break;
            case 3:
                attempts++;
                fieldGoal_3pt += made ? 1 : 0;
                break;

            default:
                System.out.println("invalid shot type: " + shotType);
        }
    }

    public int getOnePointer() {
        return fieldGoals_freeThrow;
    }

    public int getTwoPointer() {
        return fieldGoals_2pt;
    }

    public int getThreePointer() {
        return fieldGoal_3pt;
    }

    public void displayStats() {

    }
    public int getFouls(){
        return fouls;

    }
    public String getTeamName(){
        return team;
    }

}

