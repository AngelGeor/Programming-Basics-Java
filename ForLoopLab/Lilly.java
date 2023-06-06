import java.util.Scanner;

public class Lilly {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           int age = Integer.parseInt(scanner.nextLine());
           double washingMachinePrice = Double.parseDouble(scanner.nextLine());
           int toyPrice = Integer.parseInt(scanner.nextLine());

           int toys = 0;
           double allMoney = 0.0;
           double savedMoney = 0.0;

        for (int i = 1; i <=age; i++) {
            if (i % 2 == 0){
                allMoney = allMoney + 10;
                savedMoney = savedMoney + allMoney - 1;

            }else {
                toys++;
            }
        }
        double totalSum = toys * toyPrice +savedMoney;
        if (totalSum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalSum - washingMachinePrice);
        }else {
            System.out.printf("No! %.2f", washingMachinePrice - totalSum);
        }

    }
}
