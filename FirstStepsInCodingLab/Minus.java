import java.util.Scanner;

public class Minus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double result = a - b;
        System.out.println(result);


    }
}
