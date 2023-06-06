import javax.swing.*;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double total = 0;

        if (projectionType.equals("Premiere")) {
        total = 12 * rows * columns;

        }else if (projectionType.equals("Normal")){
            total = 7.50 * rows * columns;
        }else if (projectionType.equals("Discount")){
            total = 5.0 * rows * columns;
        }
        System.out.printf("%.2f", total);
    }
}
