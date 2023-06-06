
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        int toysCounter = 0;
        double moneySaved = 0;
        double allMoney = 0;

        for (int i = 1; i <=age ; i++) {
            if (i % 2 != 0) {
                toysCounter++;

            }else {
                allMoney = allMoney + 10;
                moneySaved = moneySaved + allMoney  - 1;
            }
        }
        double moneyFromToys = toysCounter * toyPrice;

        double totalSaved = moneySaved + moneyFromToys;

        if (totalSaved >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalSaved - washingMachinePrice);
        }else {
            System.out.printf("No! %.2f", washingMachinePrice - totalSaved);
        }
    }
}



