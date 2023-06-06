import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double SqMeters = Double.parseDouble(scan.nextLine());
        double price = SqMeters * 7.61;
        double discount = price * 0.18;
        double FinalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv. %nThe discount is: %.2f lv.", FinalPrice, discount);


    }
}
