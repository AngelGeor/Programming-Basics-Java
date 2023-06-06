import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        double totalDaysPlayed = holidays * 2.0 / 3 +
                (48 - weekendsHome) * 3.0 / 4 +
                weekendsHome;

        if (yearType.equals("leap")) {
            totalDaysPlayed = totalDaysPlayed + (totalDaysPlayed * 0.15);
        }

        System.out.printf("%.0f", Math.floor(totalDaysPlayed));
    }
}