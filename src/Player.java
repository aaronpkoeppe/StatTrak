public class Player {
    private String team;
    private String name;
    private int playerNumber;
    private double fieldGoals_freeThrow;
    private double fieldGoals_2pt;
    private double fieldGoal_3pt;

    public int fouls;
    private double freeThrowAttempts;
    private double twoPointAttempts;
    private double threePointAttempts;
    private int totalPoints;


    public String getTeam() {
        return team;
    }

    /**
     * @param teamName
     */

    public void setTeam(String teamName) {
        this.team = teamName;
    }

    /**
     * @return
     */

    public String getPlayerName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * @param playerNumber
     */

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     * @param shotType
     * @param made
     */

    public void shotAttempt(int shotType, boolean made) {
        switch (shotType) {
            case 1:
                freeThrowAttempts++;
                fieldGoals_freeThrow += made ? 1 : 0;
                if (made) {
                    totalPoints = totalPoints + 1;
                }
                break;
            case 2:
                twoPointAttempts++;
                fieldGoals_2pt += made ? 1 : 0;
                if (made) {
                    totalPoints = totalPoints + 2;
                }
                break;
            case 3:
                threePointAttempts++;
                fieldGoal_3pt += made ? 1 : 0;
                if (made) {
                    totalPoints = totalPoints + 3;
                }
                break;

            default:
                System.out.println("invalid shot type: " + shotType);
        }
    }

    /**
     * @return
     */
    public double getOnePointer() {
        return fieldGoals_freeThrow;
    }

    /**
     * @return
     */
    public double getTwoPointer() {
        return fieldGoals_2pt;
    }

    /**
     * @return
     */
    public double getThreePointer() {
        return fieldGoal_3pt;
    }


    public void displayStats() {
        System.out.println("#" + playerNumber + " " + name + " Fouls = " + fouls + " points = " + totalPoints);
        System.out.println("                    Attempts            Made            Percentage");
        if (fieldGoals_freeThrow == 0) {
            System.out.println("Free Throws" + "              " + freeThrowAttempts + "             " + fieldGoals_freeThrow + "                    " + "0");
        } else
            System.out.printf("Free Throws" + "              " + freeThrowAttempts + "             " + fieldGoals_freeThrow + "                 %.2f\n", (fieldGoals_freeThrow / freeThrowAttempts) * 100.0);

        if (fieldGoals_2pt == 0) {
            System.out.println("2pt field goals" + "          " + twoPointAttempts + "             " + fieldGoals_2pt + "                    " + "0");
        } else
            System.out.printf("2pt field goals" + "          " + twoPointAttempts + "             " + fieldGoals_2pt + "                %.2f\n", (fieldGoals_2pt / twoPointAttempts) * 100.0);

        if (fieldGoal_3pt == 0) {
            System.out.println("3pt field goals" + "          " + threePointAttempts + "             " + fieldGoal_3pt + "                    " + "0");
        } else
            System.out.printf("3pt field goals" + "          " + threePointAttempts + "             " + fieldGoal_3pt + "                %.2f\n", (fieldGoal_3pt / threePointAttempts) * 100.0);

    }

    /**
     * @return
     */
    public int getFouls() {
        return fouls;

    }

    /**
     * @param fouls
     */
    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    /**
     * @return
     */
    public String getTeamName() {
        return team;
    }

    public int getTotalPoints() {
        return totalPoints;
    }


}

