import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзола

        double rent = Double.parseDouble(scanner.nextLine());
        double cakePrice = 0.2 * rent;
        double drinksPrice = cakePrice - (0.45 *cakePrice);
        double animatorPrice = rent / 3;

         double totalAmount = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.println(totalAmount);
    }
}
