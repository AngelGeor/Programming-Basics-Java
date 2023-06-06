import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();


        while (!country.equals("End")) {
            double holidayPrice = Double.parseDouble(scanner.nextLine());
            double availableMoney = 0;
            while (availableMoney < holidayPrice) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += savedMoney;

            }
            System.out.printf("Going to %s!%n", country);
            country = scanner.nextLine();
        }
    }
}
