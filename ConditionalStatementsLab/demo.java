import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int number = Integer.parseInt(scanner.nextLine());

       // if number > 10 , "Bigger than 10""
        // if number <= 10 , "Smaller than 10"

        if (number > 10) {
            System.out.println("Bigger than 10");
        }else {
            System.out.println("Smaller than 10");


        }

    }
}
