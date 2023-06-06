import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

       double pricePerProduct = 0;

       switch (town) {
           case "Sofia":
               if (product.equals("coffee")) {
               pricePerProduct = 0.5;
               } else if (product.equals("water")){
                   pricePerProduct = 0.8;
               }else if (product.equals("beer")){
                   pricePerProduct = 1.20;
               }else if (product.equals("sweets")){
                   pricePerProduct = 1.45;

               }else if (product.equals("peanuts")){
                   pricePerProduct = 1.60;
               }
               break;

           case "Plovdiv":
               if (product.equals("coffee")) {
               pricePerProduct = 0.4;
           } else if (product.equals("water")){
               pricePerProduct = 0.7;
           }else if (product.equals("beer")){
               pricePerProduct = 1.15;
           }else if (product.equals("sweets")){
               pricePerProduct = 1.30;

           }else if (product.equals("peanuts")){
               pricePerProduct = 1.50;
           }
           break;

           case "Varna":

               if (product.equals("coffee")) {
                   pricePerProduct = 0.45;
               } else if (product.equals("water")){
                   pricePerProduct = 0.7;
               }else if (product.equals("beer")){
                   pricePerProduct = 1.10;
               }else if (product.equals("sweets")){
                   pricePerProduct = 1.35;

               }else if (product.equals("peanuts")){
                   pricePerProduct = 1.55;
               }
               break;

       }

            double totalPrice = pricePerProduct * quantity;
        System.out.println(totalPrice);



    }
}
