import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1. четем от конзолата
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKG = Double.parseDouble(scanner.nextLine());

        //2. Изчисляваме цените

        double raspberryPrice = 0.5 * strawberryPrice;
        double orangePrice = raspberryPrice - (0.4 * raspberryPrice);
        double bananaPrice = raspberryPrice -  (0.8 * raspberryPrice);

        //3. Сума на всеки плод = количество * тегло

        double strawberrySum = strawberryPrice * strawberryKG;
        double bananaSum = bananaPrice * bananaKg;
        double raspberrySum = raspberryPrice * raspberryKg;
        double orangeSum = orangePrice * orangeKg;

        double totalSum = strawberrySum + bananaSum + raspberrySum + orangeSum;

        System.out.printf("%.2f", totalSum);



    }
}
