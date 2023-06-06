import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double pricePerProduct = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    pricePerProduct = 2.50;

                } else if (fruit.equals("apple")) {
                    pricePerProduct = 1.20;

                } else if (fruit.equals("orange")) {
                    pricePerProduct = 0.85;

                } else if (fruit.equals("grapefruit")) {
                    pricePerProduct = 2.70;

                } else if (fruit.equals("kiwi")) {
                    pricePerProduct = 2.70;

                } else if (fruit.equals("pineapple")) {
                    pricePerProduct = 5.50;

                } else if (fruit.equals("grapes")) {
                    pricePerProduct = 3.85;

                }
                break;


            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    pricePerProduct = 2.70;

                } else if (fruit.equals("apple")) {
                    pricePerProduct = 1.25;

                } else if (fruit.equals("orange")) {
                    pricePerProduct = 0.90;

                } else if (fruit.equals("grapefruit")) {
                    pricePerProduct = 1.60;

                } else if (fruit.equals("kiwi")) {
                    pricePerProduct = 3.00;

                } else if (fruit.equals("pineapple")) {
                    pricePerProduct = 5.60;

                } else if (fruit.equals("grapes")) {
                    pricePerProduct = 4.20;
                }
                break;

        }
        double totalPrice = quantity * pricePerProduct;
        if (pricePerProduct != 0) {
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.print("error");
        }
    }
}