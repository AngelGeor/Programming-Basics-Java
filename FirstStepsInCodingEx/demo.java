import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double strawberryPrice = Double.parseDouble(scanner.nextLine());
double bananaQuantity = Double.parseDouble(scanner.nextLine());
double orangeQuantity = Double.parseDouble(scanner.nextLine());
double raspberryQuantity = Double.parseDouble(scanner.nextLine());
double strawberryQuantity = Double.parseDouble(scanner.nextLine());


double raspberryPrice = strawberryPrice / 2;
double orangePrice = raspberryPrice * 0.6;
double bananaPrice = raspberryPrice * 0.2;

double total = strawberryPrice * strawberryQuantity + bananaPrice * bananaQuantity + orangePrice * orangeQuantity +
        raspberryPrice * raspberryQuantity;

        System.out.printf("%.2f", total);


    }

}
