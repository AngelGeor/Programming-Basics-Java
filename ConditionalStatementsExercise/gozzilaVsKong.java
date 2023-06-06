import java.util.Scanner;

public class gozzilaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double totalPriceClothes = statists * priceClothes;

        if (statists > 150) {
            totalPriceClothes = totalPriceClothes - (totalPriceClothes * 0.1);
        }
        double totalPrice = totalPriceClothes + decor;

        if (totalPrice > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        } else  {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }
    }

}
