
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int size = height * length;
        boolean isFinished = false;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            size -= pieces;

            if (size <= 0) {
                isFinished = true;
              break;
        }
            input = scanner.nextLine();

        }
            if (isFinished) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
            }else {
                System.out.printf("%d pieces are left.", size);
            }
        }

    }

