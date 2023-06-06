import java.util.Scanner;

public class animalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalName = scanner.nextLine();

        switch (animalName) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }



    }
}
