import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String flowerType = scanner.nextLine();
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (flowerType) {

            case "Roses":

                totalPrice = flowerAmount * 5;
                if (flowerAmount > 80){

                    totalPrice = totalPrice - (totalPrice * 0.1);
                }

                break;

            case"Dahlias":
                totalPrice = flowerAmount * 3.80;
                if (flowerAmount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }

                break;

            case "Tulips":
                totalPrice = flowerAmount * 2.80;
                if (flowerAmount > 80){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }

                break;

            case "Narcissus":
                totalPrice = flowerAmount * 3;

                if (flowerAmount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);

                }


                break;

            case "Gladiolus":
                totalPrice = flowerAmount * 2.50;

                if (flowerAmount < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }

                break;
        }

                if(budget >= totalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            , flowerAmount, flowerType, budget - totalPrice);

                }else {

                    System.out.printf("Not enough money, you need %.2f leva more." , totalPrice - budget);
                }
    }
}
