import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;


        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                evenSum += value;

            }else {
                oddSum +=value;

            }
        }
            if (evenSum == oddSum) {
                System.out.println("Yes");
                System.out.printf("Sum = %d", evenSum);
            }else {
                System.out.println("No");
                System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
            }
    }
}
