 public class Team{
        private String name;
        private Player player1;
        private Player player2;

        public Team(){
            name = null;
            player1 = new Player();
            player2 = new Player();

                public Team(){
                this();
                this.teamName = null;
            // THIS NEEDS SETTERS AND GETTERS
                }
        }
        public int getTeamFouls(){
            return player1.getFouls() + player2.getFouls();
        }
        public int getTeamPoints(){
            return player1.getTotalPoints() + player2.getTotalPoints();
     }
     public void listPlayers(){
         System.out.println("#1 = " + player1.getPlayerName() + " #" + player1.getPlayerNumber());
         System.out.println("#1 = " + player2.getPlayerName() + " #" + player2.getPlayerNumber());
     }
    public void displayStats(){
        System.out.println(name + " Fouls" + " = " + getTeamFouls() + " Points = " + getTeamPoints());

     }
}
