public class Player {
    private String teamName;
    private String name;
    private int number;
    private int fieldGoals_freeThrow;
    private int fieldGoals_2pt;
    private int fieldGoal_3pt;
    private int fouls;
    private int techFouls;
    private int attempts;

    public Player (){
        this.teamName = null;
     this.name = null;
     this.number = 0;
     this.fieldGoals_freeThrow = 0;
     this.fieldGoals_2pt = 0;
     this.fieldGoal_3pt = 0;
     this.techFouls = 0;
     this.fouls = 0;
     this.attempts = 0;

    }
    public Player (String name, int number){
        this();
        this.teamName = null;
        this.number = 0;
        this.name = name;
        this.number = number;

    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void shotAttempt(int shotType, boolean made){
        switch(shotType){
            case 1:
                attempts ++;
                fieldGoals_freeThrow += made ? 1 : 0;
                break;
            case 2:
                attempts ++;
                fieldGoals_2pt += made ? 1 : 0;
                break;
            case 3:
                attempts ++;
                fieldGoal_3pt += made ? 1 : 0;
                break;

            default :
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
    public void displayStats(){

    }
}

