import java.util.Scanner;


public class playerCode {

    public static void main(String[] args) {
        Player Player1 = new Player("Trevor", 24);
        System.out.println(Player1.getName());
        System.out.println(Player1.getNumber());
        Player1.shotAttempt(3, true);
        System.out.println(Player1.getThreePointer());

        /*

        System.out.println("Welcome to the Basketball stat tracker");
        new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("how many players does team 1 and 2 have?");

            Scanner sc = new Scanner(System.in);

            int playerCount = sc.nextInt();
            playerCount = playerCount + 1;

            for (int i = 1; i < playerCount ; i++) {
                System.out.println("\nPlease enter a jersey number for player " + i + " on team 1 :");
                int[] jerseyNumber = new int[playerCount];
                jerseyNumber[i] =  sc.nextInt();
                System.out.println("\nPlease enter player number " + jerseyNumber[i] + "'s first and last name: ");
                String[] fullName = new String[playerCount];
                fullName[i] = sc.nextLine();
                System.out.println("how many three pointers did player number " + jerseyNumber[i] + ", " + fullName[i] + " make: ");
                 int[] player3pts = new int[playerCount];
                player3pts[i] = sc.nextInt();


            }






            for(int i = 1; i < playerCount; ++i){
                System.out.println("\nPlease enter a jersey number for player " + i + " on team 2 :");
                int jerseyNumber = Integer.parseInt(sc.nextLine());;
                System.out.println("\nPlease enter player number " + jerseyNumber + "'s first and last name: ");
                String[] fullName = new String[playerCount];
                fullName[i] = sc.nextLine();
                System.out.println("how many three pointers did player number " + jerseyNumber + ", " + fullName + " make: ");
                int player3pts = Integer.parseInt(sc.nextLine());;
                System.out.println("player number " + jerseyNumber + " made " + player3pts * 3 + " points with three pointers");
                }

         */

        }

    }


