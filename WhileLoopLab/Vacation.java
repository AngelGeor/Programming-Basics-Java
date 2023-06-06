import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine()); // колко струва ваканцията
        double availableCash = Double.parseDouble(scanner.nextLine()); // парите, с които ние разполагаме

        int days = 0; // брояч за всички дни
        int daysSpend = 0; // брояч за последователните дни, в които тя харчи


        while (availableCash < moneyNeeded && daysSpend < 5) {
            String action = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());
            days++;

            if (action.equals("spend")) {
                availableCash -= cash;
                daysSpend++;
                if (availableCash < 0) {
                    availableCash = 0;
                }
            } else if (action.equals("save")) {
                availableCash += cash;
                daysSpend = 0;
            }
        }
        if (availableCash >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (daysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);

        }


    }
}
