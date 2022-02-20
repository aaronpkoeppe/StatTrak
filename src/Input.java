import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static String getLine(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int getIntRange(String message, int lowerLimit, int upperLimit) {
        System.out.print(message);
        int stat = sc.nextInt();
        if (stat > 99 || stat < 0) {
            System.out.println("incorrect input! please try again! \n");
        }
        return stat;
    }
}
