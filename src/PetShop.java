import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int otherAnimals = Integer.parseInt(scan.nextLine());

        double totalAmount = dogs * 2.5 + otherAnimals * 4.0;
        System.out.printf("%1f lv", totalAmount);

    }
}
