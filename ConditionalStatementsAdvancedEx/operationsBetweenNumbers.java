import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0;


        String oddOrEven = "";


        switch (operator) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);

                break;

            case "-":
                result = N1 - N2;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);

                break;

            case "*":
                result = N1 * N2;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, oddOrEven);

                break;

            case "/":
                if (N2 != 0) {
                    double division = (1.0 * N1) / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, division);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;

            case "%":
                if (N2 != 0) {
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1,operator, N2, result);
                }else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;
        }


        }

    }

