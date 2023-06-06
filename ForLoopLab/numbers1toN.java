import java.util.Scanner;

public class numbers1toN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int n = 1; n <= number; n += 3) {
            System.out.println(n);

        }



    }

}
