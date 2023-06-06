import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        // да създадем конструкция която ни позволява да въведем Н на брой числа
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            // Сумиране на числтата
            sum = sum + value;

        }
        System.out.println(sum);
    }
}
