import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {

        //1. четем от конзолата Оценка - цяло число

        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        //2. Правим проверка дали Оценка >= 5

        if (grade >= 5) {
            System.out.println("Excellent!");
        }





    }
}
